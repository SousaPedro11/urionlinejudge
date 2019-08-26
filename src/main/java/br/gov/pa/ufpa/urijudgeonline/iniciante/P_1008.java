package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1008 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.00");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int numero = scanner.nextInt();
            final int horas = scanner.nextInt();
            final double valor = scanner.nextDouble();

            final double salario = horas * valor;

            sb.append("NUMBER = ")
                            .append(numero)
                            .append("\n");
            sb.append("SALARY = U$ ")
                            .append(decimalFormat
                                            .format(salario));

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
