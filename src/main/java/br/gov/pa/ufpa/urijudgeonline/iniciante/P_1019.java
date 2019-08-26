package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1019 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int n = scanner.nextInt();

            final int horas = n / 3600;
            final int minutos = (n % 3600) / 60;
            final int segundos = (n % 3600) % 60;

            sb.append(horas)
                            .append(":")
                            .append(minutos)
                            .append(":")
                            .append(segundos);

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
