package algorithms;

import java.util.Scanner;

public class Max3Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3개의 정수를 입력하세요");
        System.out.print("a의 값 : ");
        int a = scanner.nextInt();
        System.out.print("b의 값 : ");
        int b = scanner.nextInt();
        System.out.print("c의 값 : ");
        int c = scanner.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 = " + max + "입니다.");
    }
}
