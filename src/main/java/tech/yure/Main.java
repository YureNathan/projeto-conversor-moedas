package tech.yure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        ConversorApiServico conversorApiServico = new ConversorApiServico();

//        double conversao = conversorApiServico.converter(100.00,"BRL", "USD");
//        System.out.println(conversao);


        int opcao = 0;

        while(opcao != 7){
            System.out.printf("""
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
                case 1:
                    System.out.println("Digite o valor que deseja converter: ");
                    double valor = scanner.nextDouble();
                    double conversao = conversorApiServico.converter(valor, "USD", "ARS");
                    System.out.printf("Valor %.2f [USD] corresponde ao valor de =>>> %.2f [ARS]", valor, conversao);
                break;

                default:
                    System.out.println("Opção inválida.");
            }

        }
    }
}
