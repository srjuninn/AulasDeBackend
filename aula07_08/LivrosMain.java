package aula07_08;

import java.util.Scanner;

public class LivrosMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livro l1 = new Livro("Harry Potter e a pedra filosofal", "J. K. Rowling", 224);
		Livro l2 = new Livro("Percy Jackson e o ladrão de raios", "Rick Riordan", 384);
		Livro l3 = new Livro("Crepúsculo", "Stephenie Meyer", 416);
		Livro l4 = new Livro("50 tons de cinza", "El James", 514);
		Livro l5 = new Livro("Duna", "Frank Herbert", 680);

		Livro[] livros = { l1, l2, l3, l4, l5 };
		System.out.println("Lista de livros:");
		for (int i = 0; i < livros.length; i++) {
			System.out.printf("%d - Título '%s' - Autor '%s' - Quantidade de páginas '%d'%n", (i + 1),
					livros[i].getTitulo(), livros[i].getAutor(), livros[i].getPagesNum());
		}
		System.out.print("\nEscolha um livro pra mudar o número de páginas(escolha por número): ");
		int escolha = sc.nextInt();

		if (escolha >= 1 && escolha < 5) {
			Livro escolhido = livros[escolha - 1];
			System.out.print("Digite o número de páginas que deseja alterar:\nAlterar páginas: ");
			int alterar = sc.nextInt();
			escolhido.setPageNum(alterar);
		} else {
			System.out.println("Erro...");
		}
		System.out.println("Lista de livros atualizadas:");
		for (int i = 0; i < livros.length; i++) {
			System.out.printf("%d - Título '%s' - Autor '%s' - Quantidade de páginas '%d'%n", (i + 1),
					livros[i].getTitulo(), livros[i].getAutor(), livros[i].getPagesNum());
		}

		sc.close();
	}

}
