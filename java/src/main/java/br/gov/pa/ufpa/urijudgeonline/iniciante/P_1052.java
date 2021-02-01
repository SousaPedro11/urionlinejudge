package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

public class P_1052 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int n = scanner.nextInt();

            final String mes = Month.of(n).toString();

            sb
                            .append(mes.charAt(0))
                            .append(mes.substring(1).toLowerCase());

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
