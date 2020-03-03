package exercicio6;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Eq2Grau eq = new Eq2Grau();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com valor de a: ");
		eq.setA(s.nextDouble());
		
		System.out.println("Entre com valor de b: ");
		eq.setB(s.nextDouble());
		
		System.out.println("Entre com valor de c: ");
		eq.setC(s.nextDouble());

		System.out.println("Delta: " + eq.delta());
		System.out.println("Raiz 1 (Positiva): " + eq.raiz1());
		System.out.println("Raiz 2 (Negativa): " + eq.raiz2());

	}

}
