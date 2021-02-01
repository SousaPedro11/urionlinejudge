package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class P_1060 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final List<Double> numeros = new ArrayList<>();

            for (int i = 0; i < 6; i++) {
                final double n = scanner.nextDouble();
                if (n > 0) {
                    numeros.add(n);

                }

            }

            sb.append(numeros.size())
                            .append(" valores positivos");

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
