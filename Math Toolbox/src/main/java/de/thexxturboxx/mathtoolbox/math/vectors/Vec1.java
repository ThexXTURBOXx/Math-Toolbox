package de.thexxturboxx.mathtoolbox.math.vectors;

public class Vec1 {
	
	public double x1;
	
	public Vec1(double x1) {
		this.x1 = x1;
	}
	
	public Vec1 add(Vec1 vec) {
		return new Vec1(x1 + vec.x1);
	}
	
	public Vec1 substract(Vec1 vec) {
		return new Vec1(x1 - vec.x1);
	}
	
	public double scaleProduct(Vec1 vec) {
		return x1 * vec.x1;
	}
	
	public Vec1 sProduct(double factor) {
		return new Vec1(x1 * factor);
	}
	
	public Vec1 unitVec() {
		return new Vec1(1);
	}
	
	public double length() {
		return x1;
	}
	
	@Override
	public String toString() {
		return ("(" + x1 + ")").replaceAll(".0", "");
	}
	
}
