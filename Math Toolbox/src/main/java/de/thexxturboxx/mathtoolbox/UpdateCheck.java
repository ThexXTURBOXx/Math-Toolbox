package de.thexxturboxx.mathtoolbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UpdateCheck extends Thread {
	
	public static String latestVersion;
	public static final String Version = "0.0.4";
	public static EnumUpdateStatus status;
	
	@Override
	public void run() {
		try {
			URL updateJSON = new URL(MathToolbox.updateURL);
			BufferedReader in = new BufferedReader(new InputStreamReader(updateJSON.openStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) latestVersion = inputLine;
			in.close();
			if(latestVersion.equals(Version)) {
				status = EnumUpdateStatus.UP_TO_DATE;
			} else {
				status = EnumUpdateStatus.OLD;
			}
		} catch (Exception e) {
			status = EnumUpdateStatus.ERRORED;
			e.printStackTrace();
		}
	}
	
}
