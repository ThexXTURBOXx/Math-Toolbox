package de.thexxturboxx.mathtoolbox.util;

import java.net.URL;

public class FileHelper {
	
	public static String URLtoString(URL url) {
		return url.getPath().replace("%20", " ").replace("file:/", "");
	}
	
}