package aula07_08;

public class PersonagemRPG {
	private String nome;
	private String classe;
	private int nivelAtual;
	private int vidaAtual;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getNivel() {
		return nivelAtual;
	}

	public void setNivel(int nivel) {
		this.nivelAtual = nivel;
	}

	public int getVida() {
		return vidaAtual;
	}

	public void setVida(int vida) {
		this.vidaAtual = vida;
	}

	public int adicionarNivel(int nivel) {
		return nivelAtual = this.nivelAtual + nivel;
	}

	public int adicionarVida(int vida) {
		return vidaAtual = this.vidaAtual + vida;
	}

	public PersonagemRPG(String nome, String classe, int nivelAtual, int vidaAtual) {
		this.nome = nome;
		this.classe = classe;
		this.nivelAtual = nivelAtual;
		this.vidaAtual = vidaAtual;
	}
}
