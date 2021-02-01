package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1007 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            final int c = scanner.nextInt();
            final int d = scanner.nextInt();

            final int diferenca = (a * b) - (c * d);

            sb.append("DIFERENCA = ")
                            .append(diferenca);

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
