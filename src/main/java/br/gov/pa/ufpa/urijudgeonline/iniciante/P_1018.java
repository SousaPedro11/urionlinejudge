package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1018 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int valorInicial = scanner.nextInt();
            int valor = valorInicial;

            final int cem = valor / 100;
            final int cinquenta = (valor %= 100) / 50;
            final int vinte = (valor %= 50) / 20;
            final int dez = (valor %= 20) / 10;
            final int cinco = (valor %= 10) / 5;
            final int dois = (valor %= 5) / 2;
            final int um = (valor %= 2);

            sb.append(valorInicial)
                            .append("\n");
            sb.append(cem)
                            .append(" nota(s) de R$ 100,00")
                            .append("\n");
            sb.append(cinquenta)
                            .append(" nota(s) de R$ 50,00")
                            .append("\n");
            sb.append(vinte)
                            .append(" nota(s) de R$ 20,00")
                            .append("\n");
            sb.append(dez)
                            .append(" nota(s) de R$ 10,00")
                            .append("\n");
            sb.append(cinco)
                            .append(" nota(s) de R$ 5,00")
                            .append("\n");
            sb.append(dois)
                            .append(" nota(s) de R$ 2,00")
                            .append("\n");
            sb.append(um)
                            .append(" nota(s) de R$ 1,00");

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
