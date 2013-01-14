package vanityblocksstorage;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

//import Vanityblocks.Proxy;

public class ProxyClient extends Proxy {
	
    @Override
public void registerRenderInformation()  {
    	
    MinecraftForgeClient.preloadTexture("/vanityblocksstorage/vanstorage.png");
    MinecraftForgeClient.preloadTexture("/vanityblocksstorage/modstorage.png");
    //    MinecraftForgeClient.preloadTexture(anarchysvanitys.TEXTURE_ITEMS);
    }
}