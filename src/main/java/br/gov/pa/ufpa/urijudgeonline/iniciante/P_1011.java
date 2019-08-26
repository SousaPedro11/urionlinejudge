package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * Fa�a um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio
 * (R). A f�rmula para calcular o volume �: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
 * Dica: Ao utilizar a f�rmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da divis�o entre
 * dois inteiros � outro inteiro.
 * Entrada
 * O arquivo de entrada cont�m um valor de ponto flutuante (dupla precis�o), correspondente ao raio da esfera.
 * Sa�da
 * A sa�da dever� ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espa�o antes e um espa�o depois da igualdade. O valor dever�
 * ser apresentado com 3 casas ap�s o ponto.
 */
public class P_1011 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.000");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final double raio = scanner.nextDouble();

            final double pi = 3.14159;

            final double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

            sb.append("VOLUME = ")
                            .append(decimalFormat
                                            .format(volume));

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
