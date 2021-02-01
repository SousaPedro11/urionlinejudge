package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1073 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        StringBuilder sb = null;

        try {
            scanner = new Scanner(System.in);

            final int n = scanner.nextInt();

            if ((n > 5) && (n < 2000)) {

                for (int i = 1; i <= n; i++) {

                    if ((i % 2) == 0) {

                        sb = new StringBuilder();
                        sb.append(i)
                                        .append("^2 = ")
                                        .append((int) Math.pow(i, 2));

                        System.out.println(sb.toString());

                    }

                }

            }

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
