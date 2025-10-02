package aula26_09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Instanciando objetos principais
		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();

		// Inicializando usuários
		biblioteca.adicionarUsuario(new Professor(1, "Fiama", "fiama@gmail.com"));
		biblioteca.adicionarUsuario(new Professor(2, "Lucas", "lucas@gmail.com"));
		biblioteca.adicionarUsuario(new Professor(3, "Gal", "gal@gmail.com"));
		biblioteca.adicionarUsuario(new Aluno(4, "Gabriel", "gabriel@gmail.com"));
		biblioteca.adicionarUsuario(new Aluno(5, "Rodrigo", "rodrigo@gmail.com"));
		biblioteca.adicionarUsuario(new Aluno(6, "Vinicius", "vini@gmail.com"));

		// Inicializando livros
		biblioteca.adicionarLivro(new Livro(101, "O Senhor dos Anéis", "J.R.R. Tolkien", Status.DISPONIVEL));
		biblioteca.adicionarLivro(new Livro(102, "1984", "George Orwell", Status.DISPONIVEL));
		biblioteca.adicionarLivro(new Livro(103, "Dom Casmurro", "Machado de Assis", Status.DISPONIVEL));
		biblioteca
				.adicionarLivro(new Livro(104, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", Status.DISPONIVEL));
		biblioteca.adicionarLivro(new Livro(105, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", Status.DISPONIVEL));
		biblioteca.adicionarLivro(new Livro(106, "A Revolução dos Bichos", "George Orwell", Status.DISPONIVEL));
		biblioteca.adicionarLivro(new Livro(107, "Capitães da Areia", "Jorge Amado", Status.DISPONIVEL));

		// Menu interativo
		int resp;
		do {
			System.out.println("\nO que deseja fazer?");
			System.out.println("1. Cadastrar livro");
			System.out.println("2. Remover livro");
			System.out.println("3. Emprestar livro");
			System.out.println("4. Devolver livro");
			System.out.println("5. Cadastrar usuário");
			System.out.println("6. Remover usuário");
			System.out.println("7. Listar livros");
			System.out.println("8. Sair");
			System.out.print("Resposta: ");
			resp = sc.nextInt();
			sc.nextLine();

			switch (resp) {
			case 1:
				Livro novoLivro = Livro.cadastrarLivro(sc);
				biblioteca.adicionarLivro(novoLivro);
				break;

			case 2:
				biblioteca.removerLivro(sc);
				break;

			case 3:
				System.out.print("Digite o ID do usuário: ");
				int idEmp = sc.nextInt();
				sc.nextLine();
				System.out.print("Digite o código do livro: ");
				int codEmp = sc.nextInt();
				sc.nextLine();
				biblioteca.emprestarLivro(idEmp, codEmp);
				break;

			case 4:
				System.out.print("Digite o ID do usuário: ");
				int idDev = sc.nextInt();
				System.out.print("Digite o código do livro: ");
				int codDev = sc.nextInt();
				biblioteca.devolverLivro(idDev, codDev);
				break;

			case 5:
				biblioteca.cadastrarUsuario(sc);
				break;

			case 6:
				biblioteca.removerUsuario(sc);
				break;

			case 7:
				biblioteca.listarLivros();
				break;

			case 8:
				System.out.println("👋 Você escolheu sair. Obrigado por usar o sistema!");
				break;

			default:
				System.out.println("⚠️ Opção inválida. Tente novamente.");
				break;
			}
		} while (resp != 8);

		sc.close();
	}
}
