package com.company;

public class LogicalOp {

    public int checkBiggernumer(int first, int second) {

        if (first > second) {

            return first;

        } else {

            return second;
        }
    }

    //Ex 4 Tema 11

    public String textComparison(String text) {

        if (text.equals("FasttrackIT")) {

            return "Learning Text Comparison ";
        } else {
            return "Got to try some more ";
        }
    }

    //Ex 5

    public String numberText(String text, int number) {
        if (text.equals("FasttrackIT") && number <= 3) {
            return text + number;

        } else if (!text.equals("FasttrackIT") && number <= 4) {
            return number + text;
        } else {
            return "differentresult";

        }
    }
        // Ex 6

        public String number ( int number8 ){

            if (number8 > 8 || number8 ==6) {
                return "the amount of snow this winter " + number8;

            } else {

                return "the forecast snow is" + number8;


            }

        }


    }

