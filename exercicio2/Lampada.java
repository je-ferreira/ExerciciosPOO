package exercicio2;

public class Lampada {
	private boolean estado = false;
	private int qtClicks; // limite 10 cliques

	public void ligarLampada() {
		if (qtClicks < 10 && estado == false) {
			estado = true;
			qtClicks++;
			System.out.println("L�mpada acendeu.");
		} else if (qtClicks < 10 && estado == true) {
			System.out.println("J� est� acesa.");
		} else {
			estado = false; // atingiu o limite de cliques
			System.out.println("Queimou!");
		}
	}

	public void desligarLampada() {
		if (qtClicks < 10 && estado == true) {
			estado = false;
			qtClicks++;
			System.out.println("L�mpada apagou.");
		} else if (qtClicks < 10 && estado == false) {
			System.out.println("J� est� apagada.");
		} else {
			estado = false; // atingiu o limite de cliques
			System.out.println("Queimou!");
		}
	}

	public void estadoAtual() {
		if (qtClicks >=10)
			System.out.println("L�mpada queimada!");
		else if (estado == true)
			System.out.println("L�mpada est� acesa!");
		else
			System.out.println("L�mpada est� apagada!");
	}

}
