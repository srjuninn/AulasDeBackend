package aula26_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	// Atributos
	ArrayList<Livro> livros = new ArrayList<>();
	ArrayList<Usuario> usuarios = new ArrayList<>();

	// Cadastro de Usuário
	private boolean idExiste(int id) {
		for (Usuario u : usuarios) {
			if (u.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public void cadastrarUsuario(Scanner sc) {
		System.out.println("\nQual tipo de usuário deseja cadastrar?");
		System.out.println("1 - Aluno");
		System.out.println("2 - Professor");
		int tipo = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		if (idExiste(id)) {
			System.out.println("❌ Já existe um usuário com esse ID. Cadastro cancelado.");
			return;
		}

		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();

		System.out.print("Digite o email: ");
		String email = sc.nextLine();

		Usuario novoUsuario = null;

		if (tipo == 1) {
			novoUsuario = new Aluno(id, nome, email);
		} else if (tipo == 2) {
			novoUsuario = new Professor(id, nome, email);
		} else {
			System.out.println("Tipo inválido. Usuário não cadastrado.");
			return;
		}

		adicionarUsuario(novoUsuario);
	}

	public void adicionarUsuario(Usuario u) {
		usuarios.add(u);
	}

	public void removerUsuario(Scanner sc) {
		System.out.print("\nDigite o ID do usuário que deseja remover: ");
		int id = sc.nextInt();
		sc.nextLine();

		Usuario usuarioRemover = buscarUsuario(id);

		if (usuarioRemover == null) {
			System.out.println("Usuário não encontrado.");
			return;
		}

		if (!usuarioRemover.getEmprestimos().isEmpty()) {
			System.out.println("❌ Usuário possui empréstimos ativos. Não é possível remover.");
			return;
		}

		usuarios.remove(usuarioRemover);
		System.out.println("\n🗑️ Usuário removido com sucesso!");
	}

	// Cadastro de Livro
	public void adicionarLivro(Livro l) {
		if (codigoLivroExiste(l.getCodigoLivro())) {
			System.out.println("❌ Já existe um livro com esse código. Cadastro cancelado.");
			return;
		}
		livros.add(l);
	}

	public void removerLivro(Scanner sc) {
		System.out.print("Digite o código do livro que deseja remover: ");
		int codigo = sc.nextInt();
		sc.nextLine();

		Livro livroRemover = buscarLivro(codigo);

		if (livroRemover == null) {
			System.out.println("Livro não encontrado.");
			return;
		}

		if (livroRemover.getStatus() == Status.EMPRESTADO) {
			System.out.println("❌ Este livro está emprestado e não pode ser removido.");
			return;
		}

		livros.remove(livroRemover);
		System.out.println("🗑️ Livro removido com sucesso!");
	}

	public void listarLivros() {
		if (livros.isEmpty()) {
			System.out.println("📭 Nenhum livro cadastrado na biblioteca.");
			return;
		}

		System.out.println("📚 Lista de livros cadastrados:");
		for (Livro l : livros) {
			String status = l.getStatus().toString();
			String infoEmprestimo = "";

			if (l.getStatus() == Status.EMPRESTADO) {
				// Procurar quem está com o livro
				for (Usuario u : usuarios) {
					for (Emprestimo e : u.getEmprestimos()) {
						if (e.getLivro().getCodigoLivro() == l.getCodigoLivro()) {
							infoEmprestimo = " | Emprestado para: " + u.getNome() + " (ID: " + u.getId() + ")";
							break;
						}
					}
					if (!infoEmprestimo.isEmpty())
						break;
				}
			}

			System.out.printf("Código: %d | Título: %s | Autor: %s | Status: %s%s%n", l.getCodigoLivro(), l.getTitulo(),
					l.getAutor(), status, infoEmprestimo);
		}
	}

	// Empréstimo e Devolução
	public void emprestarLivro(int id, int codigoLivro) {
		Usuario usuario = buscarUsuario(id);
		Livro livro = buscarLivro(codigoLivro);

		if (usuario == null) {
			System.out.println("Usuário não encontrado.");
			return;
		}
		if (livro == null) {
			System.out.println("Livro não encontrado.");
			return;
		}
		if (livro.getStatus() != Status.DISPONIVEL) {
			System.out.println("Livro não está disponível.");
			return;
		}
		if (usuario.getEmprestimos().size() >= usuario.getLimiteEmprestimos()) {
			System.out.println("Usuário atingiu o limite de empréstimos.");
			return;
		}

		Emprestimo emprestimo = new Emprestimo(livro, usuario, java.time.LocalDate.now(), null);
		usuario.adicionarEmprestimo(emprestimo);
		emprestimo.registrarEmprestimo();
	}

	public void devolverLivro(int id, int codigoLivro) {
		Usuario usuario = buscarUsuario(id);
		Livro livro = buscarLivro(codigoLivro);

		if (usuario == null) {
			System.out.println("Usuário não encontrado.");
			return;
		}
		if (livro == null) {
			System.out.println("Livro não encontrado.");
			return;
		}

		Emprestimo emprestimoEncontrado = null;
		for (Emprestimo e : usuario.getEmprestimos()) {
			if (e.getLivro().getCodigoLivro() == codigoLivro) {
				emprestimoEncontrado = e;
				break;
			}
		}

		if (emprestimoEncontrado == null) {
			System.out.println("Esse usuário não possui esse livro emprestado.");
			return;
		}

		emprestimoEncontrado.registrarDevolucao();
		usuario.removerEmprestimo(emprestimoEncontrado);
	}

	// Métodos auxiliares
	public Usuario buscarUsuario(int id) {
		for (Usuario u : usuarios) {
			if (u.getId() == id) {
				return u;
			}
		}
		return null;
	}

	public Livro buscarLivro(int codigoLivro) {
		for (Livro l : livros) {
			if (l.getCodigoLivro() == codigoLivro) {
				return l;
			}
		}
		return null;
	}

	boolean codigoLivroExiste(int codigo) {
		for (Livro l : livros) {
			if (l.getCodigoLivro() == codigo) {
				return true;
			}
		}
		return false;
	}

}
