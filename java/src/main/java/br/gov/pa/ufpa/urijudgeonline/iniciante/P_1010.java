package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1010 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.00");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            double total = 0.0;

            for (int i = 0; i < 2; i++) {
                @SuppressWarnings("unused")
                final int cod = scanner.nextInt();
                final int num = scanner.nextInt();
                final double valor = scanner.nextDouble();

                total += num * valor;
            }

            sb.append("VALOR A PAGAR: R$ ")
                            .append(decimalFormat
                                            .format(total));

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
