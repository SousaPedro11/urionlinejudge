package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1046 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int inicio = scanner.nextInt();
            final int fim = scanner.nextInt();

            final int delta = fim - inicio;

            if (delta == 0) {
                sb.append("O JOGO DUROU 24 HORA(S)");

            } else if (delta < 0) {
                sb.append("O JOGO DUROU ")
                                .append(24 + delta)
                                .append(" HORA(S)");

            } else if (delta > 24) {
                sb.append("O JOGO DUROU ")
                                .append(delta - 24)
                                .append(" HORA(S)");

            } else {
                sb.append("O JOGO DUROU ")
                                .append(delta)
                                .append(" HORA(S)");

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
