package de.thexxturboxx.mathtoolbox.api.math;

public class Vec3 {
	
	public double x1, x2, x3;
	
	public Vec3(double x1, double x2, double x3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
	}
	
	public Vec3 add(Vec3 vec) {
		return new Vec3(x1 + vec.x1, x2 + vec.x2, x3 + vec.x3);
	}
	
	public Vec3 substract(Vec3 vec) {
		return new Vec3(x1 - vec.x1, x2 - vec.x2, x3 - vec.x3);
	}
	
	public double scaleProduct(Vec3 vec) {
		return x1 * vec.x1 + x2 * vec.x2 + x3 * vec.x3;
	}
	
	public Vec3 crossProduct(Vec3 vec) {
		return new Vec3(x2 * vec.x3 - x3 * vec.x2,
						x3 * vec.x1 - x1 * vec.x3,
						x1 * vec.x2 - x2 * vec.x1);
	}
	
	public Vec3 sProduct(double factor) {
		return new Vec3(x1 * factor, x2 * factor, x3 * factor);
	}
	
	public Vec3 divide(double factor) {
		return new Vec3(x1 / factor, x2 / factor, x3 / factor);
	}
	
	public Vec3 unitVec() {
		return sProduct(1 / length());
	}
	
	public double length() {
		return Math.sqrt(scaleProduct(this));
	}
	
	@Override
	public String toString() {
		return ("(" + x1 + "|" + x2 + "|" + x3 + ")").replaceAll(".0", "");
	}
	
}
