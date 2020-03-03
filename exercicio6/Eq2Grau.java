package exercicio6;

public class Eq2Grau {

	private double a, b, c, delta;

	public double getA() {return a;}
	public void setA(double a) {this.a = a;}

	public double getB() {return b;}
	public void setB(double b) {this.b = b;}

	public double getC() {return c;}
	public void setC(double c) {this.c = c;}
			
	public double getDelta() {return delta;}
	public void setDelta(double delta) {this.delta = delta;}
	
	
	public double delta() {
		delta = (b*b)-4*a*c;
		return delta;
	}
	
	public double raiz1() {
		double raiz1= (-b + Math.sqrt(delta))/(2*a);
		
		if (delta >= 0) {
		return raiz1;
		} else {
			return (Double.NaN);
		}
	}
	
	public double raiz2() {
		
		double raiz2= (-b - Math.sqrt(delta))/(2*a);

		if (delta >= 0) {
		return raiz2;
		} else {
			return (Double.NaN);
		}
	}
	
	
	
	
}
