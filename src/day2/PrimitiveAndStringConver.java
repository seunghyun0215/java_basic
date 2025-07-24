package day2;

import java.util.Arrays;

public class PrimitiveAndStringConver {
    public static void main(String[] args) {
        String v1 = "10";
        //문자열 '10'을 정수형 10으로 변경시 wrapper클래스를 이용하여 변경한다
        int d1 = Integer.parseInt(v1);
        System.out.println(d1 + 10);


        v1 = "3.14";
        double d2 = Double.parseDouble(v1);
        System.out.println(d2 + 0.01);

        v1 = "true";
        boolean bool1 = Boolean.parseBoolean(v1);
        System.out.println(v1);

        if (!bool1) {     //!는 not의 의미 => true => false false=> true 변경한다.
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //정수형 10을 문자열로 변경
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);

        System.out.println(str1 + " " + str2);

    }
}
