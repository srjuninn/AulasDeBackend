package aula01_08;

public class MusicaMain {

	public static void main(String[] args) {
		Musica music = new Musica();
		
		music.setTitulo("24k magic ");
		music.setGenero("POP");
		
		System.out.println(music.getTitulo() + music.getGenero());
	}

}
