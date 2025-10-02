package aula26_09;

import java.util.ArrayList;

// Classe abstrata que representa um usuário da biblioteca
public abstract class Usuario {

	// Atributos
	private int id;
	private String nome;
	private String email;
	private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

	// Construtor
	public Usuario(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	// Métodos de empréstimo
	public void adicionarEmprestimo(Emprestimo e) {
		emprestimos.add(e);
	}

	public void removerEmprestimo(Emprestimo e) {
		emprestimos.remove(e);
	}

	// Método abstrato
	public abstract int getLimiteEmprestimos();
}
