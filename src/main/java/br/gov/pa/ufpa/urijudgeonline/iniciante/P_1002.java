package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1002 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);
        final DecimalFormat df = new DecimalFormat("0.0000");

        final double PI = 3.14159;

        final double r = scanner.nextDouble();

        final double area = PI * r * r;

        System.out.println("A=" + df.format(area));
    }

}
