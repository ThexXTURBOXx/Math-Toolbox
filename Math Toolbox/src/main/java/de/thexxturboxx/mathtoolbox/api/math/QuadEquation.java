package de.thexxturboxx.mathtoolbox.api.math;

import java.io.IOException;
import java.net.URISyntaxException;

import de.thexxturboxx.mathtoolbox.util.LangHelper;

public class QuadEquation {
	
	private double a, b, c;
	private XList l;
	
	public QuadEquation(double a, double b, double c) throws IOException, URISyntaxException {
		this.a = a;
		this.b = b;
		this.c = c;
		compute();
	}
	
	public void compute() throws IOException, URISyntaxException {
		if(Math.pow(b, 2)-4*a*c < 0) {
			throw new IllegalArgumentException(LangHelper.getTranslated("exc.sqrtunderzero"));
		}
		if(a == 0) {
			throw new IllegalArgumentException(LangHelper.getTranslated("exc.divzero"));
		}
		double x1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		double x2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		l = new XList(x1, x2);
	}
	
	public XList results() {
		return l;
	}
	
	@Override
	public String toString() {
		String bS;
		String cS;
		if(b < 0) {
			bS = "-" + b + "*x";
		} else if(b == 0) {
			bS = "";
		} else {
			bS = "+" + b + "*x";
		}
		if(c < 0) {
			cS = "-" + c;
		} else if(b == 0) {
			cS = "";
		} else {
			cS = "+" + c;
		}
		String res = "0 = " + a + "*x^2" + bS + cS;
		res = res + "; x1 = " + results().get(0) + "; x2 = " + results().get(1);
		res = res.replace("+", " + ");
		res = res.replace("*", " * ");
		res = res.replace("-", " - ");
		res = res.replace("/", " / ");
		res = res.replace(".0", "");
		return res;
	}
	
}