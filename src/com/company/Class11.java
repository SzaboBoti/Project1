package com.company;
//Tema 11 Ex 3

public class Class11 {

    public static void main(String[] args) {

    LogicalOp logic = new LogicalOp();
    int CheckBiggerNumber = logic.checkBiggernumer(4,5);
        System.out.println(CheckBiggerNumber);
    //Ex4

    String textComparison = logic.textComparison("FasttrackIT");
        System.out.println(textComparison);

    //Ex 5

        String numbertext = logic.numberText("apple" , 5);
        System.out.println(numbertext);

     // Ex 6

       String number = logic.number(9 );
        System.out.println(number);
    }




}
