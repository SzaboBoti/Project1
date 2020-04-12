package com.company;

public class Main {

    public static void main(String[] args) {
        //tema 1

        String sayhello = "hello";
        System.out.println(sayhello);

        String myName = "Boti";

        System.out.println(myName);

        //tema 2


        long number8 = 2222;
        byte number2 = 44;

        double result = number8 + number2;

        System.out.println(result);

        //tema 3

        byte number1 = 30;
        short number3 = 10;

        int result2 = number1 / number3;
        System.out.println(result2);


        // tema 4. ex a

        int minus = -5;
        int positive = 8;
        int finalResult = 6;

        int result3 = minus + positive * finalResult;

        System.out.println(result3);

     //ex b

       byte fiftyfive = 55;
       byte nine = 9;
       byte nine2 =9;

       double result9 = (fiftyfive + nine) % nine2;

        System.out.println(result9);

        //ex c

        byte twenty = 20;
        byte three = -3;
        byte five = 5;
        byte eight = 8;

        int result10 = twenty + ((three * five) / eight);

        System.out.println(result10);

       //ex d

        // 5 + 15 / 3 * 2 - 8 % 3

        byte five2 = 5;
        byte fifteen = 15;
        byte three2 = 3;
        byte two = 2;
        byte eight2 = 8;
        byte three3 = 3;

        int result11 = five2 + fifteen / three2 * two - eight2 % three3;

        System.out.println(result11);

    }

}