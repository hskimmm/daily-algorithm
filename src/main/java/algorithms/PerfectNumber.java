package algorithms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + "값은 완전수입니다.");
        } else {
            System.out.println(n + "값은 완전수가 아닙니다.");
        }
    }
}
