package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1041 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        // final DecimalFormat decimalFormat = new DecimalFormat("0.00");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final double x = scanner.nextDouble();
            final double y = scanner.nextDouble();

            if ((x == 0) && (y == x)) {
                sb.append("Origem");

            } else if ((x > 0) && (y > 0)) {
                sb.append("Q1");

            } else if ((x < 0) && (y > 0)) {
                sb.append("Q2");

            } else if ((x < 0) && (y < 0)) {
                sb.append("Q3");

            } else if ((x > 0) && (y < 0)) {
                sb.append("Q4");

            } else if ((x != 0) && (y == 0)) {
                sb.append("Eixo X");
            } else if ((x == 0) && (y != 0)) {
                sb.append("Eixo Y");
            }

            // sb.append(decimalFormat.format(n));

            System.out.println(sb.toString());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
