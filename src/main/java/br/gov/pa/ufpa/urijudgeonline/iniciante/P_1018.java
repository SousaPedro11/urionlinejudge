package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1018 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);

        final int valorInicial = scanner.nextInt();
        int valor = valorInicial;

        final int cem = valor / 100;
        valor %= 100;
        final int cinquenta = valor / 50;
        valor %= 50;
        final int vinte = valor / 20;
        valor %= 20;
        final int dez = valor / 10;
        valor %= 10;
        final int cinco = valor / 5;
        valor %= 5;
        final int dois = valor / 2;
        valor %= 2;
        final int um = valor;

        System.out.println(valorInicial);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
    }
}
