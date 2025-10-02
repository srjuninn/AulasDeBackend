package aula26_09;

import java.time.LocalDate;

// Classe que representa um empréstimo de livro por um usuário
public class Emprestimo {

	// Atributos
	private Livro livro;
	private Usuario usuario;
	private LocalDate dataE; // Data de empréstimo
	private LocalDate dataD; // Data de devolução

	// Construtor
	public Emprestimo(Livro livro, Usuario usuario, LocalDate dataE, LocalDate dataD) {
		this.livro = livro;
		this.usuario = usuario;
		this.dataE = dataE;
		this.dataD = dataE.plusDays(15); // devolução padrão em 15 dias
	}

	// Getters
	public Livro getLivro() {
		return livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public LocalDate getDataEmprestimo() {
		return dataE;
	}

	public LocalDate getDataDevolucao() {
		return dataD;
	}

	// Métodos principais
	public void registrarEmprestimo() {
		livro.emprestar(usuario);
		System.out.println("\n📖 Empréstimo registrado com sucesso!\n");
		System.out.printf("Livro: %s%nUsuário: %s%nData de empréstimo: %s%nData de devolução: %s%n", livro.getTitulo(),
				usuario.getNome(), dataE, dataD);
	}

	public void registrarDevolucao() {
		livro.devolver();
		System.out.println("\n🔁 Devolução realizada com sucesso para o livro: " + livro.getTitulo());
	}
}
