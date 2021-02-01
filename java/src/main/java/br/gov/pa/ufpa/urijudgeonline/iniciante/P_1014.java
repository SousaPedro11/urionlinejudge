package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1014 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.000");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int X = scanner.nextInt();
            final double Y = scanner.nextDouble();

            final double consumo = X / Y;

            sb.append(decimalFormat
                            .format(consumo))
                            .append(" km/l");

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
