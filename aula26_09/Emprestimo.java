package aula26_09;

import java.time.LocalDate;

//	Criando a classe que vai relacionar um livro com um usuário
public class Emprestimo {
	private Livro livro;
	private Usuario usuario;
//	Data de emprestimo
	private LocalDate dataE;
//	Data de devolução
	private LocalDate dataD;

//	Criando os métodos de emprestimo e devolução
	public void registrarEmprestimo() {
		livro.emprestar(usuario);
		System.out.println("Emprestimo registrado com sucesso!");
		System.out.printf("Livro: %s%nUsuário: %s%nData de empréstimo: %s%nData de devolução: %s%n", livro.getTitulo(),
				usuario.getNome(), dataE, dataD);
	}

	public void registrarDevolucao() {
		livro.devolver();
		System.out.println("Devolução realizada com sucesso para o livro " + livro.getTitulo());
	}

//	Criando o construtor
	public Emprestimo(Livro livro, Usuario usuario, LocalDate dataE, LocalDate dataD) {
		super();
		this.livro = livro;
		this.usuario = usuario;
		this.dataE = dataE;
		this.dataD = dataD;
	}

}
