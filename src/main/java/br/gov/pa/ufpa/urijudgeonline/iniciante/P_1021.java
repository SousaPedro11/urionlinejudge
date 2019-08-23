package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1021 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            double n = scanner.nextDouble();
            double m = n * 100;

            final int n100, n50, n20, n10, n5, n2;
            final int m100, m50, m25, m10, m5, m1;

            n100 = (int) (n / 100);
            n %= 100;

            n50 = (int) (n / 50);
            n %= 50;

            n20 = (int) (n / 20);
            n %= 20;

            n10 = (int) (n / 10);
            n %= 10;

            n5 = (int) (n / 5);
            n %= 5;

            n2 = (int) (n / 2);
            n %= 2;

            m100 = (int) (n / 1);
            m %= 100;

            m50 = (int) (m / 50);
            m %= 50;

            m25 = (int) (m / 25);
            m %= 25;

            m10 = (int) (m / 10);
            m %= 10;

            m5 = (int) (m / 5);
            m %= 5;

            m1 = (int) m;

            final StringBuilder sb = new StringBuilder();
            sb.append("NOTAS:")
                            .append("\n");
            sb.append(n100)
                            .append(" nota(s) de R$ 100.00")
                            .append("\n");
            sb.append(n50)
                            .append(" nota(s) de R$ 50.00")
                            .append("\n");
            sb.append(n20)
                            .append(" nota(s) de R$ 20.00")
                            .append("\n");
            sb.append(n10)
                            .append(" nota(s) de R$ 10.00")
                            .append("\n");
            sb.append(n5)
                            .append(" nota(s) de R$ 5.00")
                            .append("\n");
            sb.append(n2)
                            .append(" nota(s) de R$ 2.00")
                            .append("\n");

            sb.append("MOEDAS:")
                            .append("\n");
            sb.append(m100)
                            .append(" moeda(s) de R$ 1.00")
                            .append("\n");
            sb.append(m50)
                            .append(" moeda(s) de R$ 0.50")
                            .append("\n");
            sb.append(m25)
                            .append(" moeda(s) de R$ 0.25")
                            .append("\n");
            sb.append(m10)
                            .append(" moeda(s) de R$ 0.10")
                            .append("\n");
            sb.append(m5)
                            .append(" moeda(s) de R$ 0.05")
                            .append("\n");
            sb.append(m1)
                            .append(" moeda(s) de R$ 0.01");

            System.out.println(sb.toString());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
