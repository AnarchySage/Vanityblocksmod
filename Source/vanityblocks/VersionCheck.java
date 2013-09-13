package vanityblocks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

public class VersionCheck extends Thread {
	public static VersionCheck instance = new VersionCheck();
	private int count = 0;

	public VersionCheck() {
		super("VanityBlocks Version Check Thread");
	}

	public static void startCheck(Side sideToCheck) {
		final Thread thread = new Thread(VersionCheck.instance);
		thread.start();
		// System.out.println("Check Starting");
	}

	@Override
	public void run() {
		final Side sideToCheck = FMLCommonHandler.instance().getSide();

		if (sideToCheck == null) {
			return;
		}

		while (this.count < 3 && DefaultProps.remoteBuildVer == 0) {
			try {
				final URL url = new URL(
						"https://dl.dropboxusercontent.com/u/126429646/VersionCheck.txt");
				final HttpURLConnection http = (HttpURLConnection) url
						.openConnection();
				http.addRequestProperty("User-Agent", "Mozilla/4.76");
				final BufferedReader in = new BufferedReader(
						new InputStreamReader(http.getInputStream()));
				String str;
				String str2[] = null;

				while ((str = in.readLine()) != null) {

					if (str.contains("Version")) {
						str = str.replace("Version=", "");

						str2 = str.split("\\.");

						if (str2 != null && str2.length == 3) {
							DefaultProps.remoteMajVer = Integer
									.parseInt(str2[0]);
							DefaultProps.remoteMinVer = Integer
									.parseInt(str2[1]);
							DefaultProps.remoteBuildVer = Integer
									.parseInt(str2[2]);
						}

						if (DefaultProps.remoteMajVer > DefaultProps.LOCALMAJVERSION
								|| DefaultProps.remoteMajVer == DefaultProps.LOCALMAJVERSION
								&& DefaultProps.remoteMinVer > DefaultProps.LOCALMINVERSION
								|| DefaultProps.remoteMajVer == DefaultProps.LOCALMAJVERSION
								&& DefaultProps.remoteMinVer == DefaultProps.LOCALMINVERSION
								&& DefaultProps.remoteBuildVer > DefaultProps.LOCALBUILDVERSION) {
							Thread.sleep(15000);

							if (sideToCheck.equals(Side.CLIENT)) {
								FMLClientHandler.instance().getClient().thePlayer
										.addChatMessage("\u00a77New \u00a73VanityBlocks \u00a77version available! v"
												+ String.valueOf(DefaultProps.remoteMajVer)
												+ "."
												+ String.valueOf(DefaultProps.remoteMinVer)
												+ "."
												+ String.valueOf(DefaultProps.remoteBuildVer)
												+ " http://www.minecraftforum.net/topic/1631527-");
								FMLClientHandler.instance().getClient().thePlayer
										.addChatMessage("\u00a73VanityBlocks: \u00a77Please remember to post ideas, bugs and just general bump the thread. More attention/bumps makes me wanna continue :)");
							} else if (sideToCheck.equals(Side.SERVER)) {
								VbLog.severe("New VanityBlocks version available! v"
										+ String.valueOf(DefaultProps.remoteMajVer)
										+ "."
										+ String.valueOf(DefaultProps.remoteMinVer)
										+ "."
										+ String.valueOf(DefaultProps.remoteBuildVer)
										+ " http://www.minecraftforum.net/topic/1631527-");

							}
						}
					}
				}
			} catch (final Exception e) {
				e.printStackTrace();
			}

			if (DefaultProps.remoteBuildVer == 0) {
				try {
					VbLog.severe("VanityBlocks update check failed! Trying again in 15 seconds");
					Thread.sleep(15000);
				} catch (final InterruptedException e) {
				}
			} else {
				VbLog.info("VanityBlocks remote version found:" + " "
						+ DefaultProps.remoteMajVer + "."
						+ DefaultProps.remoteMinVer + "."
						+ DefaultProps.remoteBuildVer);
			}

			this.count++;
			// System.out.println("Check Ran");
		}
	}

}