package day2;

public class BooleanEX2 {
    public static void main(String[] args) {
        boolean stop = false;

        int x = 30;

        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        boolean result3 = (0 < x && x < 30);
        boolean result4 = (x < 0 || 30 <= x);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}


//int x = 30;
//변수 x의 값이 20인가? 결과 result에 저장
//변수 x의 값이 20이 아닌가? 결과 result2에 저장
//변수 x의 값이 0보다 크고 30보다 작은가? 결과 result3에 저장
//변수 x의 값이 0보다 작거나 30보다 크거나 같은가? 결과 result4에 저장

//각 결과 jungol.입력.출력

