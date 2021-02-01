package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1043 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.0");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final double a = scanner.nextDouble();
            final double b = scanner.nextDouble();
            final double c = scanner.nextDouble();

            final boolean regra1 = (Math.abs(b - c) < a) && (a < (b + c));
            final boolean regra2 = (Math.abs(a - c) < b) && (b < (a + c));
            final boolean regra3 = (Math.abs(a - b) < c) && (c < (a + b));

            if (regra1 && regra2 && regra3) {
                sb.append("Perimetro = ")
                                .append(decimalFormat
                                                .format(a + b + c));

            } else {
                sb.append("Area = ")
                                .append(decimalFormat
                                                .format(((a + b) * c) / 2.0));

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
