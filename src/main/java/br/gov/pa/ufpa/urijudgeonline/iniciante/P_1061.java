package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1061 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            scanner.next();
            int diaInicio = scanner.nextInt();
            int horaInicio = scanner.nextInt();
            scanner.next();
            int minutoInicio = scanner.nextInt();
            scanner.next();
            int segundoInicio = scanner.nextInt();
            scanner.next();
            final int diaFim = scanner.nextInt();
            final int horaFim = scanner.nextInt();
            scanner.next();
            final int minutoFim = scanner.nextInt();
            scanner.next();
            final int segundoFim = scanner.nextInt();

            final int deltaH = horaFim - horaInicio;

            final int deltaM = minutoFim - minutoInicio;

            final int deltaS = segundoFim - segundoInicio;

            int resultadoDia = 0;
            int resultadoHora = 0;
            int resultadoMinuto = 0;
            int resultadoSegundo = 0;

            while (diaFim != diaInicio) {
                resultadoDia++;
                diaInicio++;

                if (diaInicio == 31) {
                    diaInicio = 1;

                }

            }

            while (horaFim != horaInicio) {
                resultadoHora++;
                horaInicio++;

                if (horaInicio == 25) {
                    horaInicio = 1;

                }

            }

            while (minutoFim != minutoInicio) {
                resultadoMinuto++;
                minutoInicio++;

                if (minutoInicio == 61) {
                    minutoInicio = 1;

                }

            }

            while (segundoFim != segundoInicio) {
                resultadoSegundo++;
                segundoInicio++;

                if (segundoInicio == 61) {
                    segundoInicio = 1;

                }

            }

            if (deltaH < 0) {
                resultadoDia--;

            }

            if (deltaM < 0) {
                resultadoHora--;

            }

            if (deltaS < 0) {
                resultadoMinuto--;

            }

            sb.append(resultadoDia)
                            .append(" dia(s)")
                            .append("\n");
            sb.append(resultadoHora)
                            .append(" hora(s)")
                            .append("\n");
            sb.append(resultadoMinuto)
                            .append(" minuto(s)")
                            .append("\n");
            sb.append(resultadoSegundo)
                            .append(" segundo(s)");

            System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }
}
