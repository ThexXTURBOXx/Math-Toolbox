package de.thexxturboxx.mathtoolbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UpdateCheck extends Thread {
	
	public static String latestVersion;
	public static final String Version = "0.0.3";
	public static boolean isNewest;
	
	@Override
	public void run() {
		try {
			URL updateJSON = new URL(MathToolbox.updateURL);
			BufferedReader in = new BufferedReader(new InputStreamReader(updateJSON.openStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) latestVersion = inputLine;
			in.close();
			isNewest = latestVersion.equals(Version);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
