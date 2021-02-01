package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1074 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int n = scanner.nextInt();

            if ((n > 0) && (n < 10000)) {

                for (int i = 0; i < n; i++) {

                    final int num = scanner.nextInt();

                    if (num == 0) {
                        sb.append("NULL");
                    } else {
                        if ((num % 2) == 0) {
                            sb.append("EVEN");

                        } else if ((num % 2) != 0) {
                            sb.append("ODD");

                        }

                        if (num > 0) {
                            sb.append(" POSITIVE");

                        } else {
                            sb.append(" NEGATIVE");

                        }
                    }

                    if (i < (n - 1)) {
                        sb.append("\n");

                    }
                }

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
