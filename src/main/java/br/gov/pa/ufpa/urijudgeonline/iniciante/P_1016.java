package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1016 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final Scanner scanner = new Scanner(System.in);

        // 1km/2min
        final int distancia = scanner.nextInt();

        final int tempo = distancia * 2;

        System.out.println(tempo + " minutos");
    }

}
