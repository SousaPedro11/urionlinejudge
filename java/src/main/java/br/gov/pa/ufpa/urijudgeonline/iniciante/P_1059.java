package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;

public class P_1059 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);

            }
        }

    }
}
