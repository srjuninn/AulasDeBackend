package aula30_07;

import java.util.Scanner;

public class RetanguloEstrutural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double retangulo[] = new double[3];

		for (int i = 1; i <= 3; i++) {
			System.out.printf("Insira a base e altura do retângulo %d%nBase: ", i);
			retangulo[0] = sc.nextDouble();
			System.out.print("Altura: ");
			retangulo[1] = sc.nextDouble();
			retangulo[2] = retangulo[0] * retangulo[1];
			System.out.printf("A altura do retângulo %d é = %.2f%n", i, retangulo[2]);
		}
		sc.close();
	}

}
