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

	//método pra checar se é vegetariana
	public boolean isVegetariana() {
		return vegetariana==true;
	}
	
	//método pra checar se é criança
	public boolean isCrianca() {
		return idade <=3;
	}
}
