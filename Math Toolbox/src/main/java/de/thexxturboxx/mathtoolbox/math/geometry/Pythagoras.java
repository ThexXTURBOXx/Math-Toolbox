package de.thexxturboxx.mathtoolbox.math.geometry;

import java.io.IOException;
import java.net.URISyntaxException;

import de.thexxturboxx.mathtoolbox.util.LangHelper;

public class Pythagoras {
	
	private double a, b, c;
	
	public Pythagoras(double a, double b, double c) throws IllegalArgumentException, IOException, URISyntaxException {
		if(a < 0 || b < 0 || c < 0) {
			throw new IllegalArgumentException(LangHelper.getTranslated("exc.sidesubzero"));
		}
		if((a == 0 && b == 0) || (b == 0 && c == 0) || (a == 0 && c == 0)) {
			throw new IllegalArgumentException(LangHelper.getTranslated("exc.twodiffsides"));
		}
		if((a >= c && c != 0) || (b >= c && c != 0)) {
			throw new IllegalArgumentException(LangHelper.getTranslated("exc.katbiggerhyp"));
		}
		this.a = a;
		this.b = b;
		this.c = c;
		compute();
	}
	
	public void compute() {
		if(c == 0) {
			c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			return;
		}
		if(b == 0) {
			b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
			return;
		}
		if(a == 0) {
			a = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
			return;
		}
	}
	
	public double get(String side) throws IOException, URISyntaxException {
		if(side.equals("a")) {
			return a;
		} else if(side.equals("b")) {
			return b;
		} else if(side.equals("c")) {
			return c;
		} else {
			throw new IllegalArgumentException(LangHelper.getTranslated("exc.sidenotfound"));
		}
	}
	
	@Override
	public String toString() {
		return ("a = " + a + "; b = " + b + "; c = " + c).replaceAll(".0", "");
	}
	
}
