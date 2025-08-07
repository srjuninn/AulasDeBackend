package aula07_08;

import java.util.Scanner;

public class PersonagemRPGMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, classe;
		int nivelAtual, vidaAtual;

		System.out.print("Seja bem vindo caro aventureiro insira seu nome\nNome: ");
		nome = sc.nextLine();
		System.out.print("Classe: ");
		classe = sc.nextLine();
		nivelAtual = 0;
		vidaAtual = 20;
		PersonagemRPG p1 = new PersonagemRPG(nome, classe, nivelAtual, vidaAtual);

		System.out.printf("%nSuas informações:\nNome: %s%nClasse: %s%nNível: %d%nVida: %d%n", p1.getNome(),
				p1.getClasse(), p1.getNivel(), p1.getVida());
		System.out.println("Gostaria de mudar suas informações ?");
		String resposta = sc.nextLine();
		if (!resposta.isEmpty()) {
			char r = Character.toUpperCase(resposta.charAt(0));
			switch (r) {
			case 'S':
				System.out.print("Insira seu Nome: ");
				nome = sc.nextLine();
				p1.setNome(nome);
				System.out.print("Insira sua Classe: ");
				classe = sc.nextLine();
				p1.setClasse(classe);
				System.out.print("Insira seu Nível: ");
				nivelAtual = sc.nextInt();
				if (nivelAtual > 1 && nivelAtual <= 100) {
					p1.setNivel(nivelAtual);
				} else {
					System.out.println("Você não pode escolher esse nível!");
				}
				System.out.print("Insira sua vida: ");
				vidaAtual = sc.nextInt();
				if (vidaAtual > 0 && vidaAtual <= 100) {
					p1.setVida(vidaAtual);
				} else {
					System.out.println("Você não pode colocar essa quantidade de vida");
				}
				break;
			case 'N':

				break;

			default:
				System.out.println("Algo deu errado, tente novamente.");
				break;
			}
		} else {
			System.out.println("Algo deu errado na resposta, tente novamente");
		}
		System.out.printf("%nSuas informações:\nNome: %s%nClasse: %s%nNível: %d%nVida: %d%n", p1.getNome(),
				p1.getClasse(), p1.getNivel(), p1.getVida());
		sc.close();
	}
}
