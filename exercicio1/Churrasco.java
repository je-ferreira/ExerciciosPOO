package exercicio1;

public class Churrasco {
	double qtdCarne;

	public void verificarConsumo(Pessoa p) {
		if (p.isVegetariana() || p.isCrianca()) {
			qtdCarne = 0;
		} else if (!p.isCrianca() && p.getIdade() < 13) {
			qtdCarne = 1;
		} else {
			qtdCarne = 2;
		}
		System.out.println("Consumo: " + qtdCarne + " kg de carne");
	}
}
