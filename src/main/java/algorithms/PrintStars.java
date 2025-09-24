package algorithms;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, w;

        do {
            System.out.print("n의 값을 입력하세요 = ");
            n = scanner.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w의 값을 입력하세요 = ");
            w = scanner.nextInt();
        } while (w <= 0 || w > n);

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i % w == w-1) {
                System.out.println();
            }
        }
    }
}
