
public class Complex {
	private double real;
	private double imag;
	
	public Complex(double real, double imag	) {
		this.real = real;
		this.imag = imag;
	}
	double getReal() {
		return real;
	}
	double getImag() {
		return imag;
	}
	public Complex add(Complex c) {
		double resultReal = real + c.getReal();
		double resultImag = imag + c.getImag();
		return new Complex(resultReal, resultImag);
	}		
	public static void main(String[] args) {
		Complex a = new Complex(1.3, 1.5);
		Complex b = new Complex(1.2, 1.4);
//		a.add(b);
		System.out.println(a.add(b).getReal() + a.add(b).getImag());

	}

}
