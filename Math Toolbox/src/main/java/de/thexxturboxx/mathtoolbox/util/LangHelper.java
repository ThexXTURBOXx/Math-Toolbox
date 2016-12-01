package de.thexxturboxx.mathtoolbox.util;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import de.thexxturboxx.mathtoolbox.MathToolbox;

public class LangHelper {
	
	public static String getTranslatedUnsafe(String name) {
		try {
			return getTranslated(name);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return name;
	}
	
	public static String getTranslated(String name) throws IOException, URISyntaxException {
		String s = newTranslation(name, ConfigHelper.get("lang"));
		if(s.equals(name)) {
			s = newTranslation(name, "en_GB");
		}
		return s;
	}
	
	public static String newTranslation(String name, String lang) throws IOException {
		List<String> lines = readAllLines(lang);
		for(String l : lines) {
			if(!l.equals("")) {
				String s = l.substring(0, l.indexOf("="));
				if(s.equals(name)) {
					return l.substring(l.indexOf("=") + 1, l.length());
				}
			}
		}
		return name;
	}
	
	public static List<String> readAllLines(String lang) throws IOException {
		BufferedReader reader = newBufferedReader(lang);
		List<String> result = new ArrayList<String>();
		for (;;) {
			String line = reader.readLine();
			if (line == null) break;
			result.add(line);
		}
		return result;
    }
	
	public static BufferedReader newBufferedReader(String lang) {
		Reader reader = new InputStreamReader(MathToolbox.class.getResourceAsStream("/de/thexxturboxx/resources/lang/" + lang + ".lang"), StandardCharsets.UTF_8.newDecoder());
		return new BufferedReader(reader);
	}
	
	public static String getLangKey(String name) {
		if(name.equals("British English")) return "en_GB";
		if(name.equals("Deutsch")) return "de_DE";
		return null;
	}

	public static int getLangIndex() {
		String name = ConfigHelper.get("lang");
		if(name.equals("de_DE")) return 0;
		if(name.equals("en_GB")) return 1;
		return -1;
	}
	
}
