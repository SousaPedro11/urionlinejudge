package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1015 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.0000");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final double px1 = scanner.nextDouble();
            final double py1 = scanner.nextDouble();
            final double px2 = scanner.nextDouble();
            final double py2 = scanner.nextDouble();

            final double distancia = Math.sqrt(
                            Math.pow(px2 - px1, 2) + Math.pow(py2 - py1, 2));

            sb.append(decimalFormat
                            .format(distancia));

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
