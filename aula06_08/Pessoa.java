package aula06_08;

public class Pessoa {
	private String nome;
	private int idade;

//	getter and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (this.idade <= 0) {
			System.out.println("Você não pode colocar uma idade menor ou igual a zero!");
		} else {
			this.idade = idade;
		}
	}

//	métodos
	public void mostrarNome() {
		System.out.printf("Nome: %s%n", this.nome);
	}

	public void mostrarIdade() {
		System.out.printf("Idade: %d%n", this.idade);
	}

//	construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

}
