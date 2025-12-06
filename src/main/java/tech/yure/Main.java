package tech.yure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorApiServico conversorApiServico = new ConversorApiServico();

        int opcao = 0;

        while (opcao != 7) {
            System.out.print("""
                    \n*********************************************
                    Seja bem-vindo/a ao Conversor de Moedas =]
                    
                    1) Dólar =>> Peso argentino
                    2) Peso argentino => Dólar
                    3) Dólar =>> Real brasileiro
                    4) Real brasileiro =>> Dólar
                    5) Dólar ==> Peso colombiano
                    6) Peso colombiano ==> Dólar
                    7) Sair
                    *********************************************
                    Escolha uma opção válida:
                    """);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o valor que deseja converter: ");
                    double valor = scanner.nextDouble();
                    double conversao = conversorApiServico.converter(valor, "USD", "ARS");
                    System.out.printf("Valor %.2f [USD] corresponde ao valor de =>>> %.2f [ARS]", valor, conversao);
                }
                case 2 -> {
                    System.out.println("Digite o valor que deseja converter: ");
                    double valor = scanner.nextDouble();
                    double conversao = conversorApiServico.converter(valor, "ARS", "USD");
                    System.out.printf("Valor %.2f [ARS] corresponde ao valor de =>>> %.2f [USD]", valor, conversao);
                }
                case 3 -> {
                    System.out.println("Digite o valor que deseja converter: ");
                    double valor = scanner.nextDouble();
                    double conversao = conversorApiServico.converter(valor, "USD", "BRL");
                    System.out.printf("Valor %.2f [USD] corresponde ao valor de =>>> %.2f [BRL]", valor, conversao);
                }
                case 4 -> {
                    System.out.println("Digite o valor que deseja converter: ");
                    double valor = scanner.nextDouble();
                    double conversao = conversorApiServico.converter(valor, "BRL", "USD");
                    System.out.printf("Valor %.2f [BRL] corresponde ao valor de =>>> %.2f [USD]", valor, conversao);
                }
                case 5 -> {
                    System.out.println("Digite o valor que deseja converter: ");
                    double valor = scanner.nextDouble();
                    double conversao = conversorApiServico.converter(valor, "USD", "COP");
                    System.out.printf("Valor %.2f [USD] corresponde ao valor de =>>> %.2f [COP]", valor, conversao);
                }
                case 6 -> {
                    System.out.println("Digite o valor que deseja converter: ");
                    double valor = scanner.nextDouble();
                    double conversao = conversorApiServico.converter(valor, "COP", "USD");
                    System.out.printf("Valor %.2f [COP] corresponde ao valor de =>>> %.2f [USD]", valor, conversao);
                }
                case 7 ->
                    System.out.println("Finalizando conversor de moedas... Até próxima");
                default -> System.out.println("Opção inválida. Tente novamente");

            }

        }
    }
}
