package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1005 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);

        final DecimalFormat decimalFormat = new DecimalFormat("0.00000");

        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double media = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.println("MEDIA = " + decimalFormat.format(media));
    }

}
