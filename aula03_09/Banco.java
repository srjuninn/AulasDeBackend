package aula03_09;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        boolean contaCriada = false;

        while (!contaCriada) {

            System.out.print(
                "Bem vindo caro usuário, gostaria de criar qual conta ?\n1.Conta Corrente\n2.Conta Poupança\n3.Conta PJ(Pessoa Jurídica)\n(Insira o número)\nOpção: ");
            option = sc.nextInt();
            sc.nextLine(); // limpa o \n deixado pelo nextInt()

            switch (option) {
            case 1:
                System.out.print(
                    "\nVocê realmente deseja criar uma Conta Corrente ?\nA conta corrente tem uma tarifa mensal de R$12,00, tem certeza que deseja continuar ?\nSim ou Não\nResposta: ");
                char resposta = sc.next().charAt(0);
                sc.nextLine(); // limpa o \n deixado pelo next()

                if (resposta == 's') {
                    System.out.print("\nInsira o nome do titular da conta\nTitular: ");
                    String titular = sc.nextLine();
                    Conta cc = new ContaCorrente("08007070", titular, 40028922, 0.0);
                    System.out.println("Conta criada com sucesso!");
                    System.out.println("Você entrou na sua conta!");
                    cc.tarifasMensais();
                    mostrarOpcoes(cc, sc);
                    contaCriada = true;
                }
                break;

            case 2:
                System.out.print(
                    "\nVocê realmente deseja criar uma Conta Poupança ? A conta poupança não tem tarifas, tem certeza que deseja criar ? \nSim ou Não\nResposta: ");
                resposta = sc.next().charAt(0);
                sc.nextLine(); // limpa o \n deixado pelo next()

                if (resposta == 's') {
                    System.out.print("\nInsira o nome do titular da conta\nTitular: ");
                    String titular = sc.nextLine();
                    Conta cp = new ContaPoupanca("08007070", titular, 40028922, 0.0);
                    System.out.println("Conta criada com sucesso!");
                    cp.tarifasMensais();
                    mostrarOpcoes(cp, sc);
                    contaCriada = true;
                }
                break;

            case 3:
                System.out.print(
                    "\nVocê realmente deseja criar uma Conta PJ ? A conta PJ (Pessoa Jurídica) tem tarifa mensal de R$20,00 e tarifa de R$1,50 a cada saque. Tem certeza que deseja criar?\nSim ou Não\nResposta: ");
                resposta = sc.next().charAt(0);
                sc.nextLine(); // limpa o \n deixado pelo next()

                if (resposta == 's') {
                    System.out.print("\nInsira o nome do titular da conta\nTitular: ");
                    String titular = sc.nextLine();
                    Conta cpj = new ContaPJ("08007070", titular, 40028922, 0.0);
                    System.out.println("Conta criada com sucesso!");
                    cpj.tarifasMensais();
                    mostrarOpcoes(cpj, sc);
                    contaCriada = true;
                }
                break;

            default:
                System.out.println("Algo deu errado, tente novamente!");
                break;
            }
        }
        sc.close();
    }

    public static void mostrarOpcoes(Conta conta, Scanner sc) {
        int option;
        do {
            System.out.print(
                "\nO que deseja fazer ?\n1.Exibir saldo\n2.Depositar\n3.Sacar\n4.Sair\nOpção: ");
            option = sc.nextInt();
            sc.nextLine(); // limpa o \n deixado pelo nextInt()

            switch (option) {
            case 1:
                conta.exibirSaldo();
                break;
            case 2:
                System.out.print("Quanto deseja depositar ?\nR$ ");
                double deposito = sc.nextDouble();
                sc.nextLine(); // limpa o \n após nextDouble()
                conta.depositar(deposito);
                break;
            case 3:
                System.out.print("Quanto deseja sacar ?\nR$ ");
                double saque = sc.nextDouble();
                sc.nextLine(); // limpa o \n após nextDouble()
                conta.sacar(saque);
                break;
            case 4:
                System.out.println("Você escolheu sair, obrigado por criar a conta no nosso banco!");
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
            }
        } while (option != 4);
    }
}
