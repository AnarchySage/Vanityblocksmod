package vanityblocks.tileentitys;

import vanityblocks.Blocks.VanityRandomBlocks;
import vanityblocks.ItemBlocks.CurtainItemBlock;
import vanityblocks.Registrations.CurtainRegistrations;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;

/*
 * Thanks to mineshopper, maker of carpenters blocks for all the help with this, if it wasnt for him, this wouldnt be done.
 * As well as the base code for the texture grabbing.
 */
public class TileCurtain extends TileEntity
{
	public byte curtainDyeColor = -1;
	public byte curtainSpecialColor = -1;
	public short curtainCover = (short) CurtainRegistrations.CurtainBlock.blockID;
	public byte curtainCoverMetadata = 0;
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);		
		curtainDyeColor = nbt.getByte("curtainDyeColor");
		curtainSpecialColor = nbt.getByte("curtainSpecialColor");
		curtainCover = nbt.getShort("curtainCover");
		curtainCoverMetadata = nbt.getByte("curtainCoverMetadata");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setByte("curtainDyeColor", curtainDyeColor);
		nbt.setByte("curtainSpecialColor", curtainSpecialColor);
		nbt.setShort("curtainCover", curtainCover);
		nbt.setByte("curtainCoverMetadata", curtainCoverMetadata);
	}
	
    /**
     * Overridden in a sign to provide the text.
     */
    @Override
	public Packet getDescriptionPacket()
    {    	
        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
    }
    
    /**
     * Called when you receive a TileEntityData packet for the location this
     * TileEntity is currently in. On the client, the NetworkManager will always
     * be the remote server. On the server, it will be whomever is responsible for 
     * sending the packet.
     * 
     * @param net The NetworkManager the packet originated from 
     * @param pkt The data packet
     */
    @Override
	public void onDataPacket(INetworkManager net, Packet132TileEntityData pkt)
    {
    	readFromNBT(pkt.customParam1);

		if (this.worldObj.isRemote)
		{
			Minecraft.getMinecraft().renderGlobal.markBlockForRenderUpdate(this.xCoord, this.yCoord, this.zCoord);
			this.worldObj.updateAllLightTypes(this.xCoord, this.yCoord, this.zCoord);
		}
    }
}
