package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P_1038 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        final DecimalFormat decimalFormat = new DecimalFormat("0.00");

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int cod = scanner.nextInt();
            final int quant = scanner.nextInt();

            double preco = 0;

            switch (cod) {
                case 1:
                    preco = 4.00;
                    break;
                case 2:
                    preco = 4.50;
                    break;
                case 3:
                    preco = 5.00;
                    break;
                case 4:
                    preco = 2.00;
                    break;
                case 5:
                    preco = 1.50;
                    break;
            }

            sb.append("Total: R$ ").append(decimalFormat.format(preco * quant));

            System.out.println(sb.toString());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
