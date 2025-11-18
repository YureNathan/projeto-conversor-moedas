package tech.yure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConsultaMoedaServices consultaMoedaServices = new ConsultaMoedaServices();
        System.out.println("digite a moeda de origem: ");
        var moedaOrigem = sc.nextLine();
        System.out.println("digite a moeda de destino: ");
        var moedaDestino = sc.nextLine();
        System.out.println(consultaMoedaServices.consulta(moedaOrigem, moedaDestino));
        System.out.println("Informações filtradas: "+ consultaMoedaServices.moedaFiltrada());

        System.out.println("Digite valor a ser convertido: ");
        var valor = sc.nextBigDecimal();
        System.out.printf("""
                CONVERTENDO DE %s PARA %s
                RESULTADO: %.2f
                """, moedaOrigem, moedaDestino, (consultaMoedaServices.converterMoedas(valor)));
    }
}
