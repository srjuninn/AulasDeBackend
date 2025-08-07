package aula07_08;

public class Livro {
	private String titulo;
	private String autor;
	private int pagesNum;

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getPagesNum() {
		return pagesNum;
	}

	public void setPageNum(int pagesNum) {
		this.pagesNum = pagesNum;
		if (pagesNum < 5) {
			System.out.println("Erro.. você não pode colocar um número de páginas menor que 5!");
		} else {
			this.pagesNum = pagesNum;
		}

	}

	public Livro(String titulo, String autor, int pagesNum) {
		this.titulo = titulo;
		this.autor = autor;
		this.pagesNum = pagesNum;
	}
}
