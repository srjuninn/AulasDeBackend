package aula27_08;

public class Pessoa {
	// atributos
	private String nome;
	private String cidade;
	private String numero;
	private String email;
	private int idade;
	private int id;
	
	// getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// construtor
	public Pessoa(String nome, String cidade, String numero, String email, int idade, int id) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.numero = numero;
		this.email = email;
		this.idade = idade;
		this.id = id;
	}
	// toString
	@Override
	public String toString() {
		return "\nInformações:\nNome: " + nome + "\nCidade: " + cidade + "\nNumero: " + numero + "\nEmail: " + email + "\nIdade: "
				+ idade;
	}
	
	
}
