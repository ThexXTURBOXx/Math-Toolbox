package de.thexxturboxx.mathtoolbox.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

import de.thexxturboxx.mathtoolbox.MathToolbox;

public class ConfigHelper {
	
	private static HashMap<String, String> cfg = new HashMap<String, String>();
	
	public static void set(String key, String value) {
		cfg.put(key, value);
	}
	
	public static String get(String key) {
		return cfg.get(key);
	}
	
	public static String getFromFile(String name) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(MathToolbox.configFile.toURI()));
		for(String l : lines) {
			String cfgName = l.substring(0, l.indexOf("="));
			if(cfgName.equals(name)) {
				return l.substring(l.indexOf("=") + 1);
			}
		}
		return get(name);
	}
	
	public static void setInFile(String name, String value) throws IOException {
		set(name, value);
		FileWriter writer = new FileWriter(MathToolbox.configFile.getAbsoluteFile());
		PrintWriter p = new PrintWriter(writer, false);
		p.flush();
		for(String s : cfg.keySet()) {
			p.println(s + "=" + cfg.get(s));
		}
		p.close();
	}
	
	public static void setAll() throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(MathToolbox.configFile.toURI()));
		for(String l : lines) {
			String cfgName = l.substring(0, l.indexOf("="));
			set(cfgName, l.substring(l.indexOf("=") + 1));
		}
	}
	
}
