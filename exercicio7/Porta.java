package exercicio7;

public class Porta {
	
	private boolean isOpen;
	private int numAberturas;
	
	public void abrir() {
		if (isOpen==false) {
			isOpen=true;
			numAberturas++;
			System.out.println("A porta foi aberta pela " + numAberturas + "ª vez.");
		} else {
			System.out.println("A porta já está aberta!");
		}
	}
	
	public void fechar() {
		if (isOpen==true) {
			isOpen=false;
			System.out.println("A porta foi fechada.");
		} else {
			System.out.println("A porta já está fechada!");
		}
	}

}
