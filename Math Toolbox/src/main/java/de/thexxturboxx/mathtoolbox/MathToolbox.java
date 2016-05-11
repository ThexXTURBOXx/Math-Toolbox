package de.thexxturboxx.mathtoolbox;

import javax.swing.JFrame;

import de.thexxturboxx.mathtoolbox.util.ConfigHelper;

public class MathToolbox {
	
	public static JFrame frame;
	
	public static void main(String[] args) {
		try {
			//Main Loop
			//TODO Allow the user to set the language in a config screen
			ConfigHelper.set("lang", "de_DE");
			frame = new MathFrame();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}