package de.thexxturboxx.mathtoolbox.api.math;

public class Vec2 {

	public double x1, x2;
	
	public Vec2(double x1, double x2) {
		this.x1 = x1;
		this.x2 = x2;
	}
	
	public Vec2 add(Vec2 vec) {
		return new Vec2(x1 + vec.x1, x2 + vec.x2);
	}
	
	public Vec2 substract(Vec2 vec) {
		return new Vec2(x1 - vec.x1, x2 - vec.x2);
	}
	
	public double scaleProduct(Vec2 vec) {
		return x1 * vec.x1 + x2 * vec.x2;
	}
	
	public Vec2 sProduct(double factor) {
		return new Vec2(x1 * factor, x2 * factor);
	}
	
	public Vec2 divide(double factor) {
		return new Vec2(x1 / factor, x2 / factor);
	}
	
	public Vec2 unitVec() {
		return sProduct(1 / length());
	}
	
	public double length() {
		return Math.sqrt(scaleProduct(this));
	}
	
	@Override
	public String toString() {
		return ("(" + x1 + "|" + x2 + ")").replaceAll(".0", "");
	}
	
}
