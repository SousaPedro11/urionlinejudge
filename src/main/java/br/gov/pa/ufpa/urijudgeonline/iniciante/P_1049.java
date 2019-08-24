package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_1049 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final String p1 = scanner.next();
            final String p2 = scanner.next();
            final String p3 = scanner.next();

            String nome = null;

            if (p1.equalsIgnoreCase("vertebrado")) {
                if (p2.equalsIgnoreCase("ave")
                                && p3.equalsIgnoreCase("carnivoro")) {
                    nome = "aguia";

                } else if (p2.equalsIgnoreCase("ave")
                                && p3.equalsIgnoreCase("onivoro")) {
                    nome = "pomba";

                } else if (p2.equalsIgnoreCase("mamifero")
                                && p3.equalsIgnoreCase("onivoro")) {
                    nome = "homem";

                } else if (p2.equalsIgnoreCase("mamifero")
                                && p3.equalsIgnoreCase("herbivoro")) {
                    nome = "vaca";

                }
            } else if (p1.equalsIgnoreCase("invertebrado")) {
                if (p2.equalsIgnoreCase("inseto")
                                && p3.equalsIgnoreCase("hematofago")) {
                    nome = "pulga";

                } else if (p2.equalsIgnoreCase("inseto")
                                && p3.equalsIgnoreCase("herbivoro")) {
                    nome = "lagarta";

                } else if (p2.equalsIgnoreCase("anelideo")
                                && p3.equalsIgnoreCase("hematofago")) {
                    nome = "sanguessuga";

                } else if (p2.equalsIgnoreCase("anelideo")
                                && p3.equalsIgnoreCase("onivoro")) {
                    nome = "minhoca";

                }
            }

            sb.append(nome);

            System.out.println(sb.toString());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
