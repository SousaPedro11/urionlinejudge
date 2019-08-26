package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1009 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.00");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            @SuppressWarnings("unused")
            final String nome = scanner.next();
            final double salarioFixo = scanner.nextDouble();
            final double vendas = scanner.nextDouble();
            final double comissao = 0.15;

            final double salario = salarioFixo + (vendas * comissao);

            sb.append("TOTAL = R$ ")
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
