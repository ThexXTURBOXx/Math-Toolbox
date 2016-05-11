package de.thexxturboxx.mathtoolbox.util;

import java.io.IOException;
import java.net.URISyntaxException;

import de.thexxturboxx.mathtoolbox.MathFrame;
import de.thexxturboxx.mathtoolbox.MathToolbox;
import de.thexxturboxx.mathtoolbox.math.vectors.VectorFrame;

public class TopicHelper {
	
	public static void openUpTopic(int value) throws IOException, URISyntaxException {
		MathToolbox.frame.dispose();
		switch(value) {
		case 0: MathToolbox.frame = new MathFrame(); break;
		case 1: MathToolbox.frame = new VectorFrame(); break;
		default: throw new IllegalArgumentException(LangHelper.getTranslated("exc.topicnotfound"));
		}
	}
	
}