package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1015 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);
        final DecimalFormat decimalFormat = new DecimalFormat("0.0000");

        final double px1 = scanner.nextDouble();
        final double py1 = scanner.nextDouble();
        final double px2 = scanner.nextDouble();
        final double py2 = scanner.nextDouble();

        final double distancia = Math.sqrt(Math.pow(px2 - px1, 2) + Math.pow(py2 - py1, 2));

        System.out.println(decimalFormat.format(distancia));
    }
}
