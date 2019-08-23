package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1020 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();

        final int ano;
        final int meses;
        final int dias;

        ano = n / 365;

        meses = (n % 365) / 30;

        dias = (n % 365) % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
