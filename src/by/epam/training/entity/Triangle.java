package by.epam.training.entity;

public class Triangle {

	private int a;
	private int b;
	private int c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public Triangle() {
		a = 10;
		b = 10;
		c = 10;
	}

	public Triangle(int a, int b, int c) {
		if (a < (b + c) && b < (a + c) && c < (b + c)) {
			this.a = a;
			this.b = b;
			this.c = c;
		} else {
			throw new RuntimeException("Triangle is not exist!");
		}
	}

	public int getPerimeter() {
		return a + b + c;
	}

	public double getSquare() {
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", getPerimeter()=" + getPerimeter() + ", getSquare()="
				+ getSquare() + "]";
	}
}

