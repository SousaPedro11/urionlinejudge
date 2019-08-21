package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores lidos seguido da mensagem "eh o maior".
 * Utilize a f�rmula:
 * Obs.: a f�rmula apenas calcula o maior entre os dois primeiros (a e b).
 * Um segundo passo, portanto � necess�rio para chegar no resultado esperado.
 * Entrada
 * O arquivo de entrada cont�m tr�s valores inteiros.
 * Sa�da
 * Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem "eh o maior".
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
