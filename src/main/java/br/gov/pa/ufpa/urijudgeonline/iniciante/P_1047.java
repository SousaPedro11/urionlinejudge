package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1047 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int hinicio = scanner.nextInt();
            final int minicio = scanner.nextInt();
            final int hfim = scanner.nextInt();
            final int mfim = scanner.nextInt();

            int deltah = hfim - hinicio;
            final int deltam = mfim - minicio;

            if (((deltah <= 0) && (deltam == 0))
                            || ((deltah < 0) && (deltam > 0))) {
                sb.append("O JOGO DUROU ")
                                .append(deltah + 24)
                                .append(" HORA(S) E ")
                                .append(deltam)
                                .append(" MINUTO(S)");

            } else if ((deltah <= 0) && (deltam < 0)) {
                sb.append("O JOGO DUROU ")
                                .append(deltah + 23)
                                .append(" HORA(S) E ")
                                .append(deltam + 60)
                                .append(" MINUTO(S)");
            } else if ((deltah > 0) && (deltam < 0)) {
                sb.append("O JOGO DUROU ")
                                .append(--deltah)
                                .append(" HORA(S) E ")
                                .append(deltam + 60)
                                .append(" MINUTO(S)");
            } else {
                sb.append("O JOGO DUROU ")
                                .append(deltah)
                                .append(" HORA(S) E ")
                                .append(deltam)
                                .append(" MINUTO(S)");
            }

            System.out.println(sb.toString());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
