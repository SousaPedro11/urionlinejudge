package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1071 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int x = scanner.nextInt();
            final int y = scanner.nextInt();

            int soma = 0;

            int inicio;
            int fim;

            if (x > y) {
                inicio = y;
                fim = x;

            } else {
                inicio = x;
                fim = y;

            }

            for (int i = inicio; i < fim; i++) {
                if (((i % 2) != 0) && (i > inicio)) {
                    soma += i;
                }
            }

            sb.append(soma);

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
