package aula26_09;

public class Biblioteca {
	public void adicionarLivro(Livro l) {
		adicionarLivro(l);
		System.out.println("Livro adicionado com sucesso " + l.getTitulo());
	}
	public void emprestarLivro(Usuario u, int codigoLivro) {
		
	}
	public void devolverLivro(Usuario u, int codigoLivro) {
		System.out.println("O livro foi devolvido com sucesso!");
	}
	public void emprestarLivro(int id, int codigoLivro) {
		System.out.println("O livro foi emprestado com sucesso!");
	}

}
