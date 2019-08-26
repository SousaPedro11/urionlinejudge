package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1020 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int idadeEmDias = scanner.nextInt();

            final int ano = idadeEmDias / 365;
            final int mes = (idadeEmDias % 365) / 30;
            final int dia = (idadeEmDias % 365) % 30;

            sb.append(ano)
                            .append(" ano(s)")
                            .append("\n");
            sb.append(mes)
                            .append(" mes(es)")
                            .append("\n");
            sb.append(dia)
                            .append(" dia(s)");

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
