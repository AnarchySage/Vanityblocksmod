package vanityblocks;

import java.util.logging.Level;
import cpw.mods.fml.relauncher.FMLRelaunchLog;

public class VbLog {
	public static void info(String message) {
		FMLRelaunchLog.log("VanityBlocks", Level.INFO, message);
	}

	public static void severe(String message) {
		FMLRelaunchLog.log("VanityBlocks", Level.SEVERE, message);
	}
}