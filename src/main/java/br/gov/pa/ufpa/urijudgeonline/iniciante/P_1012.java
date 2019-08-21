package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 * Entrada
 * O arquivo de entrada contém três valores com um dígito após o ponto decimal.
 * Saída
 * O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
 * sempre com mensagem correspondente e um
 * espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */
public class P_1012 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);
        final DecimalFormat decimalFormat = new DecimalFormat("0.000");

        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double c = scanner.nextDouble();

        final double PI = 3.14159;

        final double triangulo = (a * c) / 2.0;
        final double circulo = PI * Math.pow(c, 2);
        final double trapezio = ((a + b) * c) / 2.0;
        final double quadrado = Math.pow(b, 2);
        final double retangulo = a * b;

        System.out.println("TRIANGULO: " + decimalFormat.format(triangulo));
        System.out.println("CIRCULO: " + decimalFormat.format(circulo));
        System.out.println("TRAPEZIO: " + decimalFormat.format(trapezio));
        System.out.println("QUADRADO: " + decimalFormat.format(quadrado));
        System.out.println("RETANGULO: " + decimalFormat.format(retangulo));
    }
}
