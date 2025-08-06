package aula01_08;

public class ContaBancaria {
	private double saldo = 0.0;
	public String login;
	public String senha;

	public void saldo() {
		System.out.printf("Você tem R$%.2f", this.saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double depositar(double deposito) {
		return this.saldo += deposito;
	}

	public void mostrarSaldo() {
		System.out.printf("Seu saldo é R$%.2f%n", this.saldo);
	}

	public void sacar(double saque) {
		if (this.saldo <= 0 || saque > this.saldo) {
			System.out.println("Saque negado, verifique seu saldo.");
		} else {
			this.saldo -= saque;
			System.out.println("Saque realizado com sucesso");
		}

	}
}
