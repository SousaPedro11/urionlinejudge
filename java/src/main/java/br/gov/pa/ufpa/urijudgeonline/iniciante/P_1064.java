package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1064 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.0");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        int count = 0;
        double soma = 0;

        try {
            scanner = new Scanner(System.in);

            for (int i = 0; i < 6; i++) {
                final double n = scanner.nextDouble();
                if (n > 0) {
                    count++;
                    soma += n;
                }
            }

            sb.append(count)
                            .append(" valores positivos")
                            .append("\n");

            if (count > 0) {
                sb.append(decimalFormat
                                .format(soma / count));

            } else {
                sb.append("-nan");

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
