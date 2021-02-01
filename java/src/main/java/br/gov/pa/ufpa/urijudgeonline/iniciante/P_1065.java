package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1065 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        int count = 0;

        try {
            scanner = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                final int n = scanner.nextInt();

                if ((n % 2) == 0) {
                    count++;

                }

            }

            sb.append(count)
                            .append(" valores pares");

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
