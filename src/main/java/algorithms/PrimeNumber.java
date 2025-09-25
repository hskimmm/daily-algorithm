package algorithms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 = ");
        int n = scanner.nextInt();
        boolean isTrue = true;
        if (n <= 1) {
            isTrue = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isTrue = false;
                    break;
                }
            }
        }
        System.out.println(isTrue ? "소수입니다" : "소수가 아닙니다");
    }
}
