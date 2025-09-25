package algorithms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n을 입력하세요 = ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("파보나치 수열 = " + a + "," + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print("," + next);
            a = b;
            b = next;
        }
    }
}
