package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1040 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.0");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final double n1 = scanner.nextDouble();
            final double n2 = scanner.nextDouble();
            final double n3 = scanner.nextDouble();
            final double n4 = scanner.nextDouble();

            double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;

            double exame = 0;

            if ((media >= 5.0) && (media <= 6.9)) {
                exame = scanner.nextDouble();

            }

            sb.append("Media: ")
                            .append(decimalFormat
                                            .format(media));
            if (media >= 7.0) {
                sb.append("\n");
                sb.append("Aluno aprovado.");

            } else if (media < 5.0) {
                sb.append("\n");
                sb.append("Aluno reprovado.");

            } else if ((media >= 5.0) && (media <= 6.9)) {
                sb.append("\n");
                sb.append("Aluno em exame.")
                                .append("\n");
                sb.append("Nota do exame: ")
                                .append(decimalFormat
                                                .format(exame))
                                .append("\n");

                media = (media + exame) / 2.0;

                if (media >= 5.0) {
                    sb.append("Aluno aprovado.")
                                    .append("\n");

                } else {
                    sb.append("Aluno reprovado")
                                    .append("\n");

                }
                sb.append("Media final: ")
                                .append(decimalFormat
                                                .format(media));

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
