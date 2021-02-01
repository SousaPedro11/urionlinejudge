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

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            final int c = scanner.nextInt();

            sb.append(Math.max(Math.max(a, b), c))
                            .append(" eh o maior");

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
