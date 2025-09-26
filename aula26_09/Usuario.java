package aula26_09;

//	Criando uma classe abstrata
public abstract class Usuario {
//	Criando os atributos
	private int id;
	private String nome;
	private String email;

//	Criando os getters and setters
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

//	Criando o método abstrato
	public abstract void getLimiteEmprestimos();

//	Criando o construtor
	public Usuario(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

}
