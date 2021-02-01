package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class P_1045 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            final Double[] array = { a, b, c };

            Arrays.sort(array, Collections.reverseOrder());

            a = array[0];
            b = array[1];
            c = array[2];

            if (a >= (b + c)) {
                sb.append("NAO FORMA TRIANGULO");

            } else if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
                sb.append("TRIANGULO RETANGULO");

            } else if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
                sb.append("TRIANGULO OBTUSANGULO");

            } else if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
                sb.append("TRIANGULO ACUTANGULO");

            }

            if ((a == b) && (b == c)) {
                sb.append("\n");
                sb.append("TRIANGULO EQUILATERO");

            } else if (((a == b) && (b != c))
                            || ((a == c) && (c != b))
                            || ((b == c) && (c != a))) {
                sb.append("\n");
                sb.append("TRIANGULO ISOSCELES");

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
