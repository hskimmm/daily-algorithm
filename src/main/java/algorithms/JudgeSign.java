package algorithms;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.print("사용자 입력 값은 양수입니다.");
        } else if (a < 0) {
            System.out.print("사용자 입력 값은 음수입니다.");
        } else {
            System.out.print("사용자 입력 값은 0입니다.");
        }
    }
}
