package com.nukkitx.protocol.bedrock.v388.serializer;

import com.nukkitx.network.VarInts;
import com.nukkitx.protocol.bedrock.packet.MapCreateLockedCopyPacket;
import com.nukkitx.protocol.serializer.PacketSerializer;
import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapCreateLockedCopySerializer_v388 implements PacketSerializer<MapCreateLockedCopyPacket> {
    public static final MapCreateLockedCopySerializer_v388 INSTANCE = new MapCreateLockedCopySerializer_v388();

    @Override
    public void serialize(ByteBuf buffer, MapCreateLockedCopyPacket packet) {
        VarInts.writeLong(buffer, packet.getOriginalMapId());
        VarInts.writeLong(buffer, packet.getNewMapId());
    }

    @Override
    public void deserialize(ByteBuf buffer, MapCreateLockedCopyPacket packet) {
        packet.setOriginalMapId(VarInts.readLong(buffer));
        packet.setNewMapId(VarInts.readLong(buffer));
    }
}
