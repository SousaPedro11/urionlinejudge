package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1070 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            final int n = scanner.nextInt();

            for (int i = n; i < (n + 12); i++) {

                if ((i % 2) != 0) {
                    System.out.println(i);

                }

            }

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
