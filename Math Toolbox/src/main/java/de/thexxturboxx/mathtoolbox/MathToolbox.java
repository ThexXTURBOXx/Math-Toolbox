package de.thexxturboxx.mathtoolbox;

import java.io.File;

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
				configFile.getParentFile().mkdirs();
				configFile.createNewFile();
				ConfigHelper.setInFile("lang", "en_GB");
			} else {
				ConfigHelper.setAll();
			}
			synchronized(args) {
				new UpdateCheck().run();
			}
			frame = new StartFrame();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}