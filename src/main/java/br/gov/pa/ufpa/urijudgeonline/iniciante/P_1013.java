package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem "eh o maior".
 * Utilize a fórmula:
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
 * Um segundo passo, portanto é necessário para chegar no resultado esperado.
 * Entrada
 * O arquivo de entrada contém três valores inteiros.
 * Saída
 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */
public class P_1013 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(P_1013.maior(P_1013.maior(a, b), c) + " eh o maior");
    }

    private static int maior(final int a, final int b) {

        final int resultado = (a + b + Math.abs(a - b)) / 2;

        return resultado;
    }
}
