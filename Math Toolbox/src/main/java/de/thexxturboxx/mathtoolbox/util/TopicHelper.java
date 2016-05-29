package de.thexxturboxx.mathtoolbox.util;

import java.io.IOException;
import java.net.URISyntaxException;

import de.thexxturboxx.mathtoolbox.MathToolbox;
import de.thexxturboxx.mathtoolbox.StartFrame;
import de.thexxturboxx.mathtoolbox.frames.math.PythagorasFrame;
import de.thexxturboxx.mathtoolbox.frames.math.QuadFrame;
import de.thexxturboxx.mathtoolbox.frames.math.VectorFrame;

public class TopicHelper {
	
	public static void openUpTopic(int value) throws IOException, URISyntaxException {
		MathToolbox.frame.dispose();
		switch(value) {
		case 0: MathToolbox.frame = new StartFrame(); break;
		case 1: MathToolbox.frame = new VectorFrame(); break;
		case 2: MathToolbox.frame = new PythagorasFrame(); break;
		case 3: MathToolbox.frame = new QuadFrame(); break;
		default: throw new IllegalArgumentException(LangHelper.getTranslated("exc.topicnotfound"));
		}
	}
	
	public static String getTopicName(int value) throws IOException, URISyntaxException {
		switch(value) {
		case 0: return LangHelper.getTranslated("main.beginning");
		case 1: return LangHelper.getTranslated("math.vectors");
		case 2: return LangHelper.getTranslated("math.pythagoras");
		case 3: return LangHelper.getTranslated("math.quadequation");
		default: throw new IllegalArgumentException(LangHelper.getTranslated("exc.topicnotfound"));
		}
	}
	
}