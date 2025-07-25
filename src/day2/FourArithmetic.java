package day2;

import java.util.Scanner;

public class FourArithmetic {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번재 정수 jungol.입력 :");
        a = sc.nextInt();

        System.out.print("두번째 정수 jungol.입력 :");
        b = sc.nextInt();


        System.out.printf("a+b=%d\n", a, b, a + b);
        System.out.printf("a-b=%d\n", a, b, a - b);
        System.out.printf("a*b=%d\n", a, b, a * b);
        System.out.printf("a/b=%d\n", a, b, a / b);

    }
}
