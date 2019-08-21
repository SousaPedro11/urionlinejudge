package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
 * a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
 * b) a �rea do c�rculo de raio C. (pi = 3.14159)
 * c) a �rea do trap�zio que tem A e B por bases e C por altura.
 * d) a �rea do quadrado que tem lado B.
 * e) a �rea do ret�ngulo que tem lados A e B.
 * Entrada
 * O arquivo de entrada cont�m tr�s valores com um d�gito ap�s o ponto decimal.
 * Sa�da
 * O arquivo de sa�da dever� conter 5 linhas de dados. Cada linha corresponde a uma das �reas descritas acima,
 * sempre com mensagem correspondente e um
 * espa�o entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 d�gitos ap�s o ponto decimal.
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
