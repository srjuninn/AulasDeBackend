package aula26_09;

//	Classe Aluno herda de Usuario
public class Aluno extends Usuario {

	// Atributo específico
	private int limiteEmprestimos = 2;

	// Construtor
	public Aluno(int id, String nome, String email) {
		super(id, nome, email);
	}

	// Implementação do método abstrato
	@Override
	public int getLimiteEmprestimos() {
		return limiteEmprestimos;
	}
}
