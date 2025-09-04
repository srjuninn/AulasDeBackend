package aula03_09;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String agencia, String titular, int numeroDaConta, double saldo) {
		super(agencia, titular, numeroDaConta, saldo);
	}

	@Override
	public double tarifasMensais() {
		return 0;
	}

}
