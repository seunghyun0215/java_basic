package day3;

import java.util.Scanner;

public class BlockScope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름입력:");
        String name = sc.nextLine();
        callname(name);

        //System.out.println("나의 이름은 " + name);
    }

    private static void callname(String name){
        System.out.println("나의 이름은 "+ name);



    }
}
