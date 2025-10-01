package aula26_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Livro implements Emprestavel {
//	Criando os atributos
	private int codigoLivro;
	private String titulo;
	private String autor;
	private Status status;

//	Criando os getters and setters
	public int getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

//	Criando os métodos
	@Override
	public void emprestar(Usuario u) {
		if (this.status == Status.DISPONIVEL) {
			this.status = Status.EMPRESTADO;
			System.out.println("Empréstimo feito com sucesso!");
		} else {
			System.out.println("O livro não está disponível para empréstimo.");
		}
	}

	@Override
	public void devolver() {
		if (this.status == Status.EMPRESTADO) {
			this.status = Status.DISPONIVEL;
			System.out.println("Livro devolvido com sucesso.");
		} else {
			System.out.println("Esse livro já está disponível!");
		}

	}

	public static Livro cadastrarLivro(Scanner sc) {
		System.out.print("insira o codigo do livro: ");
		int codigoLivro = sc.nextInt();
		sc.nextLine();
		System.out.print("\ninsira o título do livro: ");
		String tituloLivro = sc.nextLine();
		System.out.print("\ninsira o autor do livro: ");
		String autorLivro = sc.nextLine();
		return new Livro(codigoLivro, tituloLivro, autorLivro, Status.DISPONIVEL);
	}

	public static void removerLivro(Scanner sc, ArrayList<Livro> livros) {
		System.out.println("insira o código do livro que deseja remover");
		int codigoLivro = sc.nextInt();
		sc.nextLine();

		boolean removido = false;
		for (Livro l : livros) {
			if (l.getCodigoLivro() == codigoLivro) {
				livros.remove(l);
				System.out.println("Livro removido com sucesso");
				removido = true;
				break;
			}
		}
		if (!removido) {
			System.out.println("O livro não encontrado.");
		}
	}

//	Criando o construtor

	public Livro(int codigoLivro, String titulo, String autor, Status status) {
		super();
		this.codigoLivro = codigoLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.status = status;
	}

}
