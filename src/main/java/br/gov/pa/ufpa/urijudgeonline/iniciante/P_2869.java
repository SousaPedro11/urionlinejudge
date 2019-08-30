package br.gov.pa.ufpa.urijudgeonline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P_2869 {

    public static void main(final String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = null;
        // final StringBuilder sb = new StringBuilder();

        try {
            scanner = new Scanner(System.in);

            final int n = scanner.nextInt();

            P_2869.dividers(n);

            // System.out.println(sb.toString());

        } finally {
            if (scanner != null) {
                scanner.close();

            }
        }

    }

    private static int dividers(int n) {

        int count = 0;

        int i = 2;
        while (n >= 1) {
            if ((n % i) == 0) {
                n = n / i;
                System.out.println(i);
                count++;
            } else if (n == 1) {
                break;
            } else {
                i++;
            }
        }

        // System.out.println(count);
        return count;

        /*
         * final boolean hash[] = new boolean[n + 1];
         * Arrays.fill(hash, true);
         * for (int p = 2; (p * p) < n; p++) {
         * if (hash[p] == true) {
         * for (int i = p * 2; i < n; i += p) {
         * hash[i] = false;
         * }
         * }
         * }
         * // Traversing through
         * // all prime numbers
         * int total = 1;
         * for (int p = 2; p <= n; p++) {
         * if (hash[p]) {
         * // calculate number of divisor
         * // with formula total div =
         * // (p1+1) * (p2+1) *.....* (pn+1)
         * // where n = (a1^p1)*(a2^p2)....
         * // *(an^pn) ai being prime divisor
         * // for n and pi are their respective
         * // power in factorization
         * int count = 0;
         * if ((n % p) == 0) {
         * while ((n % p) == 0) {
         * n = n / p;
         * count++;
         * }
         * total = total * (count + 1);
         * }
         * }
         * }
         * System.out.println(total);
         * return total;
         */
    }
}
