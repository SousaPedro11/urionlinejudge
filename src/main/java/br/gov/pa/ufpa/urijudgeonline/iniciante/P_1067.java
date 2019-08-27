package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1067 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            final int n = scanner.nextInt();

            if ((n > 0) && (n <= 1000)) {

                for (int i = 1; i <= n; i++) {

                    if ((i % 2) != 0) {
                        System.out.println(i);

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
