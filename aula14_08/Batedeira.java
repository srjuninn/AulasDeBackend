package aula14_08;

public class Batedeira extends Eletrodomestico {
	private int velocidade;

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Batedeira(String nome, String cor, double preco, int tensao, int potencia, int velocidade) {
		super(nome, cor, preco, tensao, potencia);
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		return "Batedeira Informações:\nNome: " + this.getNome() + "\nCor: " + this.getCor() + "\nPreço: "
				+ this.getPreco() + "\nTensão: " + this.getTensao() + "\nPotência: " + this.getPotencia()
				+ "\nVelocidade: " + velocidade;
	}

}
