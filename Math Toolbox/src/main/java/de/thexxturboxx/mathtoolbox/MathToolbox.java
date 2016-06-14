package de.thexxturboxx.mathtoolbox;

import java.io.File;
import java.util.Locale;

import javax.swing.JFrame;

import de.thexxturboxx.mathtoolbox.util.ConfigHelper;

public class MathToolbox {
	
	public static JFrame frame;
	public static final String homeURL = "http://thexxturboxx.github.io/Math-Toolbox/";
	public static final String updateURL = "https://raw.githubusercontent.com/ThexXTURBOXx/Math-Toolbox/master/version.json";
	public static final File configFile = new File(System.getProperty("user.home") + "/MathToolbox/config.cfg");
	
	public static void main(String[] args) {
		try {
			//Main Loop
			if(!configFile.exists()) {
				System.out.println("<--- First-Run-Setup --->");
				System.out.println("Creating necessary files and folders");
				configFile.getParentFile().mkdirs();
				configFile.createNewFile();
				System.out.println("Analyzing language");
				if(Locale.getDefault().toString().equals("de_DE")) {
					System.out.println("Using German");
					ConfigHelper.setInFile("lang", "de_DE");
				} else {
					System.out.println("Using English");
					ConfigHelper.setInFile("lang", "en_GB");
				}
			} else {
				System.out.println("Getting values from config-file");
				ConfigHelper.setAll();
			}
			synchronized(args) {
				System.out.println("Checking for updates...");
				new UpdateCheck().run();
				switch(UpdateCheck.status) {
					case ERRORED: System.out.println("Update-check exited with an error"); break;
					case OLD: System.out.println("New update found: " + UpdateCheck.Version + " --> " + UpdateCheck.latestVersion); break;
					case UP_TO_DATE: System.out.println("No update was found"); break;
				}
			}
			frame = new StartFrame();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}