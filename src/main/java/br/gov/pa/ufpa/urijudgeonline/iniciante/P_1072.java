package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1072 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        int in = 0;
        int out = 0;

        try {
            scanner = new Scanner(System.in);

            final int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {

                final int num = scanner.nextInt();

                if ((num >= 10) && (num <= 20)) {
                    in++;

                } else {
                    out++;

                }

            }

            sb.append(in)
                            .append(" in")
                            .append("\n");

            sb.append(out)
                            .append(" out");

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
