package aula14_08;

public class MainProgram {

	public static void main(String[] args) {
		Batedeira b1 = new Batedeira("Batedeira Turbo", "Branca", 199.90, 220, 400, 5);
		Microondas m1 = new Microondas("Microondas Grill", "Preto", 499.90, 220, 1000, true);
		
		System.out.println(b1.toString());
		System.out.println(m1.toString());
	}

}
