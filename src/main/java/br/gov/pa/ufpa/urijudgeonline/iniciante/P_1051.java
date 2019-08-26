package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1051 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.00");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final double n = scanner.nextDouble();
            double valorIR = 0.0;

            if ((n >= 0)
                            && (n <= 2000)) {
                sb.append("Isento");

            } else {
                if ((n >= 2000.01)
                                && (n <= 3000)) {
                    valorIR = (n - 2000) * 0.08;

                } else if ((n >= 3000.01)
                                && (n <= 4500)) {
                    valorIR = ((n - 3000) * 0.18) + 80;

                } else if (n > 4500) {
                    valorIR = ((n - 4500) * 0.28) + 350;

                }

                sb.append("R$ ")
                                .append(decimalFormat
                                                .format(valorIR));

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
