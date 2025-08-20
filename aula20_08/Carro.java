package aula20_08;

public class Carro extends Veiculo {

	public Carro(String nome, String modelo, String cor, int ano) {
		super(nome, modelo, cor, ano);
	}

	@Override
	public void iniciar() {
		System.out.println("O carro está dando partida...");
	}
	

}
