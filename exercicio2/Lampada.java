package exercicio2;

public class Lampada {
	private boolean estado = false;
	private int qtClicks; // limite 10 cliques

	public void ligarLampada() {
		if (qtClicks < 10 && estado == false) {
			estado = true;
			qtClicks++;
			System.out.println("Lâmpada acendeu.");
		} else if (qtClicks < 10 && estado == true) {
			System.out.println("Já está acesa.");
		} else {
			estado = false; // atingiu o limite de cliques
			System.out.println("Queimou!");
		}
	}

	public void desligarLampada() {
		if (qtClicks < 10 && estado == true) {
			estado = false;
			qtClicks++;
			System.out.println("Lâmpada apagou.");
		} else if (qtClicks < 10 && estado == false) {
			System.out.println("Já está apagada.");
		} else {
			estado = false; // atingiu o limite de cliques
			System.out.println("Queimou!");
		}
	}

	public void estadoAtual() {
		if (qtClicks >=10)
			System.out.println("Lâmpada queimada!");
		else if (estado == true)
			System.out.println("Lâmpada está acesa!");
		else
			System.out.println("Lâmpada está apagada!");
	}

}
