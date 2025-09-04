package aula03_09;

public class ContaPJ extends Conta {

	public ContaPJ(String agencia, String titular, int numeroDaConta, double saldo) {
		super(agencia, titular, numeroDaConta, saldo);
	}

	@Override
	public double tarifasMensais() {
		double taxa = 20;
		super.setSaldo(super.getSaldo() - taxa);
		return super.getSaldo();
	}

	@Override
	public void sacar(double valor) {
		valor += 1.50;
		super.sacar(valor);
	}

}
