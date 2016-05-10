package de.thexxturboxx.mathtoolbox.util;

import java.util.HashMap;

public class ConfigHelper {
	
	private static HashMap<String, String> cfg = new HashMap<String, String>();
	
	public static void set(String key, String value) {
		cfg.put(key, value);
	}
	
	public static String get(String key) {
		return cfg.get(key);
	}
	
}
