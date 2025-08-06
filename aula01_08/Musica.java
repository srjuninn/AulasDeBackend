package aula01_08;

public class Musica {
	private String titulo;
	private String artista;
	private String genero;
	private String anoDeLancamento;
	
	public void tocar() {
		System.out.printf("A música é: %s de %s", titulo, artista);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(String anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public String toString() {
		return "O título da música é " + titulo + ", artista " + artista + ", genero " + genero + ", anoDeLancamento="
				+ anoDeLancamento + "";
	}
	
	
}
