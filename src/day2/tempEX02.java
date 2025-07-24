package day2;

public class tempEX02 {

    public static void main(String[] args){
        int X =3;
        int Y =5;
        int temp =0;

        System.out.printf("X =%d , Y =%d , temp =%d \n",X,Y,temp);

        temp = X;
        X = Y;
        Y = temp;
        System.out.printf("X =%d , Y =%d , temp =%d \n",X,Y,temp);


    }
}
