package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1006 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);

        final DecimalFormat decimalFormat = new DecimalFormat("0.0");

        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double c = scanner.nextDouble();

        final double media = ((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10;

        System.out.println("MEDIA = " + decimalFormat.format(media));

    }

}
