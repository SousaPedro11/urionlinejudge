package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1066 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        int cpar = 0;
        int cimpar = 0;
        int cpos = 0;
        int cneg = 0;

        try {
            scanner = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                final int n = scanner.nextInt();

                if ((n % 2) == 0) {
                    cpar++;

                } else {
                    cimpar++;

                }

                if (n > 0) {
                    cpos++;

                } else if (n < 0) {
                    cneg++;

                }
            }

            sb.append(cpar)
                            .append(" valor(es) par(es)")
                            .append("\n");
            sb.append(cimpar)
                            .append(" valor(es) impar(es)")
                            .append("\n");
            sb.append(cpos)
                            .append(" valor(es) positivo(s)")
                            .append("\n");
            sb.append(cneg)
                            .append(" valor(es) negativo(s)");

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
