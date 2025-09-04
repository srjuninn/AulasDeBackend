package aula03_09;

abstract class Conta {
	private String agencia = "08007070";
	private String titular;
	private int numeroDaConta = 40028922;
	private double saldo = 0.0;

	public String getAgencia() {
		return agencia;
	}

//		this.agencia = agencia;
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		 this.saldo += valor;
	}

	public void sacar(double valor) {
		if (this.saldo <= 0) {
			System.out.printf("%nVocê não pode sacar, seu saldo é de R$%.2f", this.saldo);
		} else {
			System.out.printf("%nSaque realizado com sucesso!%nNovo saldo: R$%.2f", this.saldo);
		}
	}

	public void exibirSaldo() {
		System.out.printf("%nSaldo atual: R$%.2f", this.saldo);
	}

	abstract double tarifasMensais();

	public Conta(String agencia, String titular, int numeroDaConta, double saldo) {
		super();
		this.agencia = agencia;
		this.titular = titular;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

}
