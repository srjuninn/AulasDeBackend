package aula26_09;

public class Professor extends Usuario {
	private int limiteEmprestimos = 5;

//	construtor do usuário
	public Professor(int id, String nome, String email) {
		super(id, nome, email);
	}

// 	ultilizando o método abstrato
	@Override
	public void getLimiteEmprestimos() {
		System.out.println("Você tem um limite de " + this.limiteEmprestimos + " emprestimos");
	}
}
