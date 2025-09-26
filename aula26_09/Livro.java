package aula26_09;

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

//	Criando o construtor

	public Livro(int codigoLivro, String titulo, String autor, Status status) {
		super();
		this.codigoLivro = codigoLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.status = status;
	}

}
