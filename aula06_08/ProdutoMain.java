package aula06_08;

import java.util.Scanner;

public class ProdutoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto rice = new Produto("Arroz", 25.90);
		Produto beans = new Produto("Feijão", 17.99);
		Produto pasta = new Produto("Macarrão", 11.54);
		Produto sugar = new Produto("Açucar", 9.77);
		Produto coffee = new Produto("Café", 14.89);

		Produto[] produtos = { rice, beans, pasta, sugar, coffee };
		System.out.println("Lista de produtos:");

		for (int i = 0; i < produtos.length; i++) {
			System.out.printf("%d - %s R$%.2f%n", i + 1, produtos[i].getNome(), produtos[i].getPreco());
		}

		System.out.print("Escolha um produto (insira o número): ");
		int escolha = sc.nextInt();

		if (escolha >= 1 && escolha <= produtos.length) {
			Produto escolhido = produtos[escolha - 1];
			System.out.println("Aplicando desconto...");
			escolhido.aplicarDesconto(0.3);
		} else {
			System.out.println("Opção inválida...");
		}
		sc.close();
	}

}
