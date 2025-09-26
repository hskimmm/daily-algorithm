package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 수 = ");
        int num = scanner.nextInt();

        int[] x = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }
        System.out.println("Before" + Arrays.toString(x));
        reverse(x);
        System.out.println("After" + Arrays.toString(x));
    }

    public static void reverse(int[] x) {
        for (int i = 0; i < x.length/2; i++) {
            swap(x, i, x.length-i-1);
        }
    }

    public static void swap(int[] x, int i, int j) {
        int a = x[i];
        x[i] = x[j];
        x[j] = a;
    }
}
