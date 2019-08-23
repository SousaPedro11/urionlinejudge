package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1036 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.00000");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final double a = scanner.nextDouble();
            final double b = scanner.nextDouble();
            final double c = scanner.nextDouble();

            final double delta = Math.pow(b, 2) - (4 * a * c);

            if ((a != 0) && !(delta < 0)) {

                final double r1 = (-b + Math.sqrt(delta)) / (2 * a);
                final double r2 = (-b - Math.sqrt(delta)) / (2 * a);

                sb.append("R1 = ")
                                .append(decimalFormat.format(r1))
                                .append("\n");
                sb.append("R2 = ")
                                .append(decimalFormat.format(r2));
            } else {
                sb.append("Impossivel calcular");
            }

            System.out.println(sb.toString());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
