package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P_1042 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            final int c = scanner.nextInt();

            final Set<Integer> list = new TreeSet<>();
            list.add(a);
            list.add(b);
            list.add(c);

            list.forEach(i -> {
                sb.append(i).append("\n");
            });

            sb.append("\n");

            sb.append(a)
                            .append("\n");
            sb.append(b)
                            .append("\n");
            sb.append(c);

            System.out.println(sb.toString());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
