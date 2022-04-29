package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.dungeons.DungeonChallenge;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.DungeonChallengeBeginNotifyOuterClass.DungeonChallengeBeginNotify;

public class PacketDungeonChallengeBeginNotify extends BasePacket {
	
	public PacketDungeonChallengeBeginNotify(DungeonChallenge challenge) {
		super(PacketOpcodes.DungeonChallengeBeginNotify);

		DungeonChallengeBeginNotify proto = DungeonChallengeBeginNotify.newBuilder()
				.setChallengeId(challenge.getChallengeId())
				.setChallengeIndex(challenge.getChallengeIndex())
				.setGroupId(challenge.getGroup().id)
				.build();
		
		this.setData(proto);
	}
}
