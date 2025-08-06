package aula30_07;

import java.util.Scanner;

public class RetanguloMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo rt = new Retangulo();

		for (int i = 1; i <= 3; i++) {
			System.out.printf("Insira a base e a altura do retângulo %d%nBase: ", i);
			rt.base = sc.nextDouble();
			System.out.print("Altura: ");
			rt.altura = sc.nextDouble();
			System.out.printf("A área do retângulo %d é %.2f%n", i, rt.calcularArea());
		}
		sc.close();
	}

}
