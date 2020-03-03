package exercicio1;

public class Pessoa {
	private String nome;
	private Sexo sexo;
	private int idade;
	private boolean vegetariana;
	
	
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	public Sexo getSexo() {return sexo;}
	public void setSexo(Sexo sexo) {this.sexo = sexo;}

	public int getIdade() {return idade;}
	public void setIdade(int idade) {this.idade = idade;}

	public boolean getVegetariana() {return vegetariana;}
	public void setVegetariana(boolean vegetariana) {this.vegetariana = vegetariana;}

	//m�todo pra checar se � vegetariana
	public boolean isVegetariana() {
		return vegetariana==true;
	}
	
	//m�todo pra checar se � crian�a
	public boolean isCrianca() {
		return idade <=3;
	}
}
