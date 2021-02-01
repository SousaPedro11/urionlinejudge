package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class P_1050 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final Map<Integer, String> mapa = new HashMap<>();
            mapa.put(61, "Brasilia");
            mapa.put(71, "Salvador");
            mapa.put(11, "Sao Paulo");
            mapa.put(21, "Rio de Janeiro");
            mapa.put(32, "Juiz de Fora");
            mapa.put(19, "Campinas");
            mapa.put(27, "Vitoria");
            mapa.put(31, "Belo Horizonte");

            final int n = scanner.nextInt();

            if (mapa.containsKey(n)) {
                sb.append(mapa.get(n));

            } else {
                sb.append("DDD nao cadastrado");

            }

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
