package aula03_09;

public class ContaCorrente extends Conta {

	public ContaCorrente(String agencia, String titular, int numeroDaConta, double saldo) {
		super(agencia, titular, numeroDaConta, saldo);
	}

	@Override
	public double tarifasMensais() {
		double taxa = 12.00;
		super.setSaldo(super.getSaldo() - taxa);
		return super.getSaldo();
	}

}
