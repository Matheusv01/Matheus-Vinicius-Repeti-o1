import java.util.Scanner;

public class caixa7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double saldo = 0;
        int opcao;

        for (;;) {

            System.out.println("\n--- CAIXA ELETRÔNICO ---");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor do saque: R$ ");
                double valorSaque = teclado.nextDouble();

                if (valorSaque <= 0) {
                    System.out.println("Operação cancelada. Valor inválido!");
                } else if (valorSaque > saldo) {
                    System.out.println("Operação cancelada. Saldo insuficiente!");
                } else {
                    saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso!");
                }

            } else if (opcao == 2) {
                System.out.print("Digite o valor do depósito: R$ ");
                double valorDeposito = teclado.nextDouble();

                if (valorDeposito <= 0) {
                    System.out.println("Operação cancelada. Valor inválido!");
                } else {
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                }

            } else if (opcao == 3) {
                System.out.printf("Seu saldo atual é: R$" +saldo);

            } else if (opcao == 0) {
                System.out.println("Encerrando o sistema. Obrigado por usar o nosso caixa eletrônico!");
                break;

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}