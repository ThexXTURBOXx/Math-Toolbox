package de.thexxturboxx.mathtoolbox.math.algebra;

import java.util.ArrayList;
import java.util.List;

public class XList {
	
	private List<Double> list = new ArrayList<Double>();
	
	public XList(double x1, double x2) {
		list.add(x1);
		list.add(x2);
	}
	
	public XList(double x1, double x2, double x3) {
		list.add(x1);
		list.add(x2);
		list.add(x3);
	}
	
	public XList(double x1, double x2, double x3, double x4) {
		list.add(x1);
		list.add(x2);
		list.add(x3);
		list.add(x4);
	}
	
	public double get(int index) {
		return list.get(index);
	}
	
}
