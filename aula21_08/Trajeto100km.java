package aula21_08;

import java.util.Scanner;

public class Trajeto100km {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro c1 = new Carro("");
		Bicicleta b1 = new Bicicleta("");
		Onibus oni = new Onibus("", 0);

		String modelo;
		int paradas;
		float distancia;

		System.out.print("Bem vindo ao trajtoEz!\nQual seria seu destino (insira em km)?\nDistancia: ");
		distancia = sc.nextFloat();
		sc.nextLine();

		System.out.print("\nInsira o modelo do carro: ");
		modelo = sc.nextLine();
		c1.setModelo(modelo);

		System.out.print("\nInsira o modelo da bicicleta: ");
		modelo = sc.nextLine();
		b1.setModelo(modelo);

		System.out.print("\nInsira o modelo do onibus: ");
		modelo = sc.nextLine();
		System.out.print("\nInsira a quantidade de paradas se fosse de ônibus: ");
		paradas = sc.nextInt();
		oni.setModelo(modelo);
		oni.setNumeroParadas(paradas);

		c1.calcularTempo(distancia);
		b1.calcularTempo(distancia);
		oni.calcularTempo(distancia);
		

		System.out.printf("Em um trajeto de %.2fkm, você iria demorar:%n%s: %s%n%s: %s%n%s: %s", distancia, c1.getModelo(),
				c1.calcularTempo(distancia), b1.getModelo(), b1.calcularTempo(distancia), oni.getModelo(),
				oni.calcularTempo(distancia));
		sc.close();
	}

}
