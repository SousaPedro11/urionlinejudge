package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1014 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);
        final DecimalFormat decimalFormat = new DecimalFormat("0.000");

        final int X = scanner.nextInt();
        final double Y = scanner.nextDouble();

        final double consumo = X / Y;

        System.out.println(decimalFormat.format(consumo) + " km/l");
    }

}
