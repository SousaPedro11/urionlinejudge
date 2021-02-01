package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1035 {

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

            if ((b > c) && (d > a) && ((c + d) > (a + b)) && (c > 0) && (d > 0) && ((a % 2) == 0)) {
                sb.append("Valores aceitos");

            } else {
                sb.append("Valores nao aceitos");

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
