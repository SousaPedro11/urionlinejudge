package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1008 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);
        final DecimalFormat decimalFormat = new DecimalFormat("0.00");

        final int numero = scanner.nextInt();
        final int horas = scanner.nextInt();
        final double valor = scanner.nextDouble();

        final double salario = horas * valor;

        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + decimalFormat.format(salario));
    }

}
