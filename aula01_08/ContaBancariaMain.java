package aula01_08;

import java.util.Scanner;

public class ContaBancariaMain {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		Scanner sc = new Scanner(System.in);
		int options;
		double deposito;
		double saque;

		System.out.print("Insira seu login e sua senha meu caro usuário!\nLogin: ");
		cb.login = sc.nextLine();
		System.out.print("Senha: ");
		cb.senha = sc.nextLine();

		do {
			System.out.println("\nO que você deseja fazer ?\n1.Ver Saldo\n2.Depositar\n3.Sacar\n4.Sair");
			options = sc.nextInt();

			switch (options) {
			case 1:
				cb.mostrarSaldo();
				break;
			case 2:
				System.out.println("Quanto você deseja depositar ?");
				deposito = sc.nextDouble();
				cb.depositar(deposito);

				System.out.printf("Saldo atualizado com sucesso!%nSeu saldo atual = R$%.2f%n", cb.getSaldo());
				break;
			case 3:
				System.out.println("Quanto que você deseja sacar ?");
				saque = sc.nextDouble();
				cb.sacar(saque);

				break;

			default:
				System.out.println("Algo deu errado, tente novamente!");
				break;
			}
		} while (options != 4);
		sc.close();
	}

}