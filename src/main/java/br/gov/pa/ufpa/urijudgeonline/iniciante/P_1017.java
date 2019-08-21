package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1017 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);
        final DecimalFormat decimalFormat = new DecimalFormat("0.000");

        final int tempo = scanner.nextInt();
        final int velocidade = scanner.nextInt();

        final double distancia = velocidade * tempo;

        final double litros = distancia / 12.0;

        System.out.println(decimalFormat.format(litros));
    }
}
