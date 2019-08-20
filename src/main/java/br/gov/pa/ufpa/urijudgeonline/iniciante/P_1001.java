package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P_1001 {

    public static void main(final String[] args) throws IOException {

        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();

        final int b = scanner.nextInt();

        final int x = a + b;

        System.out.printf("X = %d\n", x);

    }

}