package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class P_2869 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        // final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int n = scanner.nextInt();

            P_2869.dividers(n);

            // System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }

    private static int dividers(final int n) {

        final List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                // System.out.println(i);
                list.add(i);

            }

        }

        System.out.println("Nº de divisores: " + list.size());
        list.forEach(System.out::println);

        return list.size();

    }
}
