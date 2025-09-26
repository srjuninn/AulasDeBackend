package aula26_09;

//	usando a herança da classe usuário no aluno
public class Aluno extends Usuario {
	private int limiteEmprestimos = 2;

//	ultilizando o construtor do usuario pra qundo for criar o aluno	
	public Aluno(int id, String nome, String email) {
		super(id, nome, email);
	}

	// adicionando um uma lógica no metódo abstrato
	@Override
	public void getLimiteEmprestimos() {
		System.out.println("Você tem um limite de " + this.limiteEmprestimos + " emprestimos");
	}

}
