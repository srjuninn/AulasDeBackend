package aula06_08;

public class Produto {
	private String nome;
	private double preco;

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void aplicarDesconto(double desconto) {
		if (this.preco <= 0) {
			System.out.println("Esse produto não tem desconto");
		} else {
			double valorDesconto = this.preco * desconto;
			double novoPreco = this.preco - valorDesconto;
			System.out.printf("O preço com %.0f%% de desconto é: R$%.2f%n", desconto * 100, novoPreco);
		}

	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
}
