package day2;

public class StringEX {

    public static void main(String[] args){
        String name = "신세계";
        String job = "프로그래머";

        System.out.println(name + "과장의 직무는" + job + "입니다" );

        String str = "나는 \'자바\'를 배우고 있습니다.";
        System.out.println(str);

        String str1 = "나는\t자바\t를 배우고 있습니다.";
        System.out.println(str1);


        //java14버전부터 지원되는 """ """

        String str3 = """
                {
                "id":"spring",
                "name":"봄이"
                }
                """;

        System.out.println(str3);

    }
}
