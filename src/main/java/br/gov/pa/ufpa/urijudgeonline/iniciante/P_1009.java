package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1009 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);
        final DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int cod;
        int num;
        double valor;

        double total = 0.0;

        for (int i = 0; i < 2; i++) {
            cod = scanner.nextInt();
            num = scanner.nextInt();
            valor = scanner.nextDouble();

            total += num * valor;
        }

        System.out.println("VALOR A PAGAR: R$ " + decimalFormat.format(total));
    }
}
