package exercicio4;

public class Teste {

	public static void main(String[] args) {
		
		TrianguloEqui t = new TrianguloEqui(10);
		
		System.out.println("Lado informado: " + t.getLado());
		t.calcArea();
		t.calcPerimetro();
	}

}
