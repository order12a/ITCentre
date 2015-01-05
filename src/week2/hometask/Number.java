package week2.hometask;

public class Number{
	private int n;	

	public Number(int n) {
		this.n = n;
	}

	public int get() {
		return n;
	}
	
	public Number add(Number num) {
		Number x = new Number(this.n + num.get());
		return  x;
	}

	public Number sub(Number num) {
		Number x = new Number(this.n - num.get());
		return  x;
	}

	public Number mul(Number num) {
		Number x = new Number(this.n * num.get());
		return  x;
	}
	
	public Number div(Number num) {
		Number x = new Number(this.n / num.get());
		return  x;
	}
	
	public Number pow(Number exponent) {
		int i = 1;
		int k = n;
		while (exponent.get() >= i) {
			n = n * k;
			i++;
		}
		return new Number(n);
	}
	
	public Number fact() {
		int f = 1;
		for (int i = 1; i <= this.n; i++) {
			f = f * i;
		}
		
		return  new Number(f);
	}
	
	public Number mod(Number num) {
		return  new Number(this.n % num.get());
	}
}
