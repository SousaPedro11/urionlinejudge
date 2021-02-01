package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1044 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int a = scanner.nextInt();
            final int b = scanner.nextInt();

            if (((a % b) == 0)
                            || ((b % a) == 0)) {
                sb.append("Sao Multiplos");

            } else {
                sb.append("Nao sao Multiplos");

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
