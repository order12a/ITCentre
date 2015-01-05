package week2.hometask;

public class Fraction {
	private double n;
	
	public Fraction(double n) {
		this.n = n;
	}
	
	public double getN() {
		return n;
	}
	
	public Fraction add(Fraction frac) {
		return new Fraction(this.n + frac.getN());
	}
	
	public Fraction sub(Fraction frac) {
		return new Fraction(this.n - frac.getN());
	}
	
	public Fraction mul(Fraction frac) {
		return new Fraction(this.n * frac.getN());
	}
	
	public Fraction div(Fraction frac) {
		return new Fraction(this.n / frac.getN());
	}
	
	public String toString() {
		String s = this.getN() + "";
		return s;
	}
	
	public void print() {
		System.out.println(this.n);
	}
}
