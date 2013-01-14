package vanityblocksstorage;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

//import Vanityblocks.Proxy;

public class ProxyClient extends Proxy {
	
    @Override
public void registerRenderInformation()  {
    	
    MinecraftForgeClient.preloadTexture("/VanityBlocksStorage/storage.png");
    //    MinecraftForgeClient.preloadTexture(anarchysvanitys.TEXTURE_ITEMS);
    }
	public void addNames()
	{
		LanguageRegistry.instance().addStringLocalization("redstoneblock.name", "en_US", "Redstone Block");
	}
}