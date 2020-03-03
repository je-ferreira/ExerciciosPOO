package exercicio1;

public class Teste {

	public static void main(String[] args) {
		Pessoa p= new Pessoa();
		p.setNome("Jess");
		p.setSexo(Sexo.FEMININO);
		p.setIdade(26);
		p.setVegetariana(false);
		
		Churrasco c=new Churrasco();
		c.verificarConsumo(p);
		
	}

}
