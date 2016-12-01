package de.thexxturboxx.mathtoolbox.exc;

import de.thexxturboxx.mathtoolbox.util.LangHelper;

public class MathException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public MathException(String msg) {
		super(LangHelper.getTranslatedUnsafe(msg));
	}
	
}