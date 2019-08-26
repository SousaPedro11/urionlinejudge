package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1037 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final double n = scanner.nextDouble();

            if ((n >= 0) && (n <= 25)) {
                sb.append("Intervalo [0,25]");

            } else if ((n > 25) && (n <= 50)) {
                sb.append("Intervalo (25,50]");

            } else if ((n > 50) && (n <= 75)) {
                sb.append("Intervalo (50,75]");

            } else if ((n > 75) && (n <= 100)) {
                sb.append("Intervalo (75,100]");

            } else {
                sb.append("Fora de intervalo");

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
