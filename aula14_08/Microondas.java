package aula14_08;

public class Microondas extends Eletrodomestico {

	private boolean hasLight = true;

	public boolean getLight() {
		return hasLight;
	}

	public void setLight(boolean hasLight) {
		this.hasLight = hasLight;
	}

	public Microondas(String nome, String cor, double preco, int tensao, int potencia, boolean hasLight) {
		super(nome, cor, preco, tensao, potencia);
		this.hasLight = hasLight;
	}

	@Override
	public String toString() {
		return "\nMicroondas Informações:" + "\nNome: " + this.getNome() + "\nCor: " + this.getCor() + "\nPreço: "
				+ this.getPreco() + "\nTensão: " + this.getTensao() + "\nPotência: " + this.getPotencia()
				+ "\nTem luz interna ? " + this.getLight();
	}

}
