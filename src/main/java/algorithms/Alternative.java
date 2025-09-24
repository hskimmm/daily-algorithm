package algorithms;

import java.util.Scanner;

public class Alternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("정수를 입력하세요 = ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i=0; i <= n-1; i++) {
            if (i % 2 == 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}
