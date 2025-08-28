package aula27_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> banco = new ArrayList<>();
		ArrayList<Pessoa> cache = new ArrayList<>();

		String resposta;
		String buscarNome;
		int id = 0;

		System.out.println("Bem vindo meu caro usuário, esse é o banco de informações:");

		if (banco.isEmpty() || cache.isEmpty()) {
			System.out.print("\nO banco está vazio\n");
		}

		do {
			System.out.print("\nDeseja inserir informações ?\nResposta(sim ou não): ");
			resposta = sc.nextLine().toLowerCase();

			if (resposta.equals("sim")) {

				System.out.print("\nInsira o nome: ");
				String nome = sc.nextLine();

				System.out.print("\nInsira a cidade: ");
				String cidade = sc.nextLine();

				System.out.print("\nInsira o número de telefone(apenas números com DDD): ");
				String numeros = sc.nextLine();

				System.out.print("\nInsira o email: ");
				String email = sc.nextLine();

				System.out.print("\nInsira sua idade: ");
				int idade = sc.nextInt();
				sc.nextLine();
				Pessoa p1 = new Pessoa(nome, cidade, numeros, email, idade, id++);
				banco.add(p1);
				System.out.printf("%n%s adicionado com sucesso%n", p1.getNome());
			
			} else if (resposta.equals("não")) {
				break;
			
			} else {
				System.out.println("digito inválido");
			}

		} while (!resposta.equalsIgnoreCase("não"));
		
		do {
			
			System.out.print(
					"\nInsira o nome do usuário que deseja buscar as informações(caso não deseja, insira 'não')\nNome: ");
			buscarNome = sc.nextLine().toLowerCase();
			boolean encontrado = false;
		
			for (Pessoa pessoa : cache) {
			
				if (pessoa.getNome().equalsIgnoreCase(buscarNome)) {
					System.out.println(pessoa.toString());
					encontrado = true;
					break;
				}
			}
			
			if (!encontrado) {
			
				for (Pessoa pessoa : banco) {
				
					if (pessoa.getNome().equalsIgnoreCase(buscarNome)) {
						System.out.println(pessoa.toString());
						encontrado = true;

						if (!cache.contains(pessoa)) {
							if (cache.size() == 10) {
								cache.remove(cache.size() - 1);
							}
							cache.add(0, pessoa);
						}
						break;
					}
				}
				
				if (!encontrado && !buscarNome.equalsIgnoreCase("não")) {
					System.out.println("Usuário não encontrado em nenhum lugar");
				}
			}

		} while (!buscarNome.equalsIgnoreCase("não"));

		System.out.print("\nObrigado...");
		sc.close();
	}
}
