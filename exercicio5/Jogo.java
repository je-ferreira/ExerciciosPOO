package exercicio5;
import java.math.*;
import java.util.Scanner;

public class Jogo {
	
	private int tentativas;
	private int numRandom, numPalpite;
	
	public int getNumRandom() {return numRandom;} //s� pra testar

	public int sortearNumero() {
		numRandom = (int) (Math.random()*100); //cast pra retornar int, *100 porque desconsidera o ultimo
		return numRandom;
	}
	
	public void simulaAdiv() {
		
		Scanner s = new Scanner(System.in); //entrada via teclado
		
		for (tentativas = 1; numPalpite!=numRandom; tentativas++) { //tentativa em 1, porque j� � a primeira
			System.out.println("Adivinhe o n�mero <0/99>: ");
			numPalpite=s.nextInt();
			if ((numPalpite<0 || numPalpite>99)){
				System.out.println("O numero est� entre 0 e 99, tente novamente!");
			}
			else
				if (numPalpite < numRandom) {
					System.out.println("Tente um n�mero maior!");
				}
				else if (numPalpite > numRandom) {
					System.out.println("Tente um n�mero menor!");
				}
				else
					System.out.println("Parab�ns, voc� acertou na " + tentativas + "� tentativa!");
		}
		
		s.close(); //fecha o scanner
	}

}
