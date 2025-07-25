package day3;

import java.util.Scanner;

public class 반복제어문1_1 {
    public static void main(String[] args) {

        for(int loop =1 ; loop <= 15; loop++){
            System.out.printf("%d ", loop);

        }

        Scanner in = new Scanner(System.in);

        char c = in.next() .charAt(0);


        for (int i = 1; i <=20 ; i++){
            System.out.printf("%c" , c);

            for(int i1 =1 ; i1 <= 26 ; i1++) {
                int ch = 65;

                System.out.printf("%c, ch");
                ch = ch + 1;

                int total =0;
                for (int a = 1 ; a <=100 ; a++){
                    total = total + a;

                }
                System.out.println("1-100의 총합 " + total);

            }

        }
        }
}
