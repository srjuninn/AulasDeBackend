package aula06_08;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade, options;
		
		System.out.print("Qual é seu nome ?\nNome: ");
		nome = sc.nextLine();
		System.out.print("Qual é sua idade ?\nIdade: ");
		idade = sc .nextInt();
		while (idade <= 0) {
			System.out.print("\nTa achando que sou burro ? so idade maior que 0!\nInsira a idade novamente: ");
			idade = sc.nextInt();
		}
		sc.nextLine();
		Pessoa p1 = new Pessoa(nome, idade);
		p1.mostrarNome();
		p1.mostrarIdade();
		do {
			System.out.print("\nGostaria de alterar seu nome ou sua idade ?(1-5)\n1. Alterar Nome\n2. Alterar Idade\n3. Alterar ambos\n4. Mostrar Dados\n5. Sair\nOpção: ");
			options = sc.nextInt();
			switch (options) {
			case 1:
			System.out.print("\nInsira seu novo nome: \nNome: ");
			sc.nextLine();
			nome = sc.nextLine();
			p1.setNome(nome);
				break;
			case 2:
				System.out.print("\nInsira sua nova idade: \nIdade: ");
				idade = sc.nextInt();
				while (idade <= 0) {
					System.out.print("\nTa achando que sou burro ? so idade maior que 0!\nInsira a idade novamente: ");
					idade = sc.nextInt();
				}
				p1.setIdade(idade);				
				break;
			case 3:
				sc.nextLine();
				System.out.print("\nInsira seu novo nome: \nNome: ");
				nome = sc.nextLine();
				p1.setNome(nome);
				System.out.print("\nInsira sua nova idade: \nIdade: ");
				idade = sc.nextInt();
				p1.setIdade(idade);
				break;
			case 4:
				p1.mostrarNome();
				p1.mostrarIdade();
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Algo deu errado, tente novamente!");
			}
		} while (options != 5);
		sc.close();
	}

}
