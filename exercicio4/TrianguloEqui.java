package exercicio4;
import java.math.*;

public class TrianguloEqui {

	private double lado, perimetro, area;
	
	
	//gets
	public double getPerimetro() {return perimetro;}
	public double getArea() {return area;}
	public double getLado() {return lado;}
	
	//construtor somente pro lado
	public TrianguloEqui(double lado) {
		this.lado = lado;
	}

	public void calcArea() {
		area = lado*(Math.sqrt(3)/2); //fórmula garcia
		//area = (lado*lado)*(Math.sqrt(3)/4) - fórmula internet
		System.out.println("Área: " + area);
	};

	public void calcPerimetro() {
		perimetro = 3*lado;
		System.out.println("Perímetro: " + perimetro);
	}

}
