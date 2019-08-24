package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1048 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.00");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final double salario = scanner.nextDouble();
            double reajuste = 0;
            int percentual = 0;

            if ((salario >= 0) && (salario <= 400)) {
                percentual = 15;

            } else if ((salario >= 400.01) && (salario <= 800)) {
                percentual = 12;

            } else if ((salario >= 800.01) && (salario <= 1200)) {
                percentual = 10;

            } else if ((salario >= 1200.01) && (salario <= 2000)) {
                percentual = 7;

            } else if (salario > 2000) {
                percentual = 4;
            }

            reajuste = (salario * percentual) / 100;

            sb.append("Novo salario: ")
                            .append(decimalFormat
                                            .format(salario + reajuste))
                            .append("\n");
            sb.append("Reajuste ganho: ")
                            .append(decimalFormat
                                            .format(reajuste))
                            .append("\n");
            sb.append("Em percentual: ")
                            .append(percentual)
                            .append(" %");

            System.out.println(sb.toString());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
