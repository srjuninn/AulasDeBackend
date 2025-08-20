package aula20_08;

public class Veiculo {

	private String nome;
	private String modelo;
	private String cor;
	private int ano;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Veiculo(String nome, String modelo, String cor, int ano) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	public void iniciar() {
		System.out.println("O carro está iniciando...");
	}

	@Override
	public String toString() {
		return "Veiculo: " + this.nome + "\nModelo: " + this.modelo + "\nCor: " + this.cor + "\nAno: " + this.ano;
	}

}
