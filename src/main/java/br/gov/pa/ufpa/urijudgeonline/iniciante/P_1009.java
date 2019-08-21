package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1009 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);
        final DecimalFormat decimalFormat = new DecimalFormat("0.00");

        final String nome = scanner.next();
        final double salarioFixo = scanner.nextDouble();
        final double vendas = scanner.nextDouble();
        final double comissao = 0.15;

        final double salario = salarioFixo + (vendas * comissao);

        System.out.println("TOTAL = R$ " + decimalFormat.format(salario));

    }
}
