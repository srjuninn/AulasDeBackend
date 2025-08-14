package aula14_08;

public class Eletrodomestico {

	private String nome;
	private String cor;
	private double preco;
	private int tensao;
	private int potencia;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Eletrodomestico(String nome, String cor, double preco, int tensao, int potencia) {
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.tensao = tensao;
		this.potencia = potencia;
	}

}
