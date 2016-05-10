package de.thexxturboxx.mathtoolbox.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import de.thexxturboxx.mathtoolbox.MathToolbox;

public class LangHelper {
	
	public static String getTranslated(String name) throws IOException, URISyntaxException {
		String s = newTranslation(name, ConfigHelper.get("lang"));
		if(s.equals(name)) {
			s = newTranslation(name, "en_GB");
		}
		return s;
	}
	
	private static String newTranslation(String name, String lang) throws IOException {
		URL u = MathToolbox.class.getResource("/de/thexxturboxx/resources/lang/" + lang + ".lang");
		List<String> lines = Files.readAllLines(Paths.get(u.getFile().substring(1).replace("%20", " ")));
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
	
}
