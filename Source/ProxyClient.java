package vanityblocks;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

//import Vanityblocks.Proxy;

public class ProxyClient extends Proxy {
	
    @Override
public void registerRenderInformation()  {
    	
    MinecraftForgeClient.preloadTexture("/vanityblocks/vanstorage.png");
    MinecraftForgeClient.preloadTexture("/vanityblocks/modstorage.png");
    MinecraftForgeClient.preloadTexture("/vanityblocks/te.png");
    MinecraftForgeClient.preloadTexture("/vanityblocks/vanity.png");
    //    MinecraftForgeClient.preloadTexture(anarchysvanitys.TEXTURE_ITEMS);
    }
}