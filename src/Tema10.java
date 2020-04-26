public class Tema10


{
    public static void main(String[] args) {
        myName();
        twoNumbers();
        divide();
        divide2();
        divide3();
        divide4();
        divide5();

        int addingupmethod = addingup(10, 10);
        System.out.println(addingupmethod);

        int decreasingmethod = decreasing(20 , 10);
        System.out.println(decreasingmethod);
    }

    public static void myName () {

     String boti = "actual name ";
        System.out.println("ex1:" + boti);


    }
      public static void twoNumbers (){

      int result = 2 + 2;

          System.out.println("ex2: "+ result);
    }

    public static void divide (){

    byte result2 = 12 / 4;

        System.out.println("ex3:" + result2);
    }

    public static void divide2() {

        int result =   -5 + 8 * 6;
        System.out.println("ex4:" + result);
    }

    public static void divide3() {

        int result = (55 + 9) % 9;
        System.out.println("ex5:" + result);

    }
     public static void divide4() {

         int result = 20 + -3 * 5 / 8;
         System.out.println("ex6:" + result);

     }

     public static void divide5() {

     int result =     5 + 15 / 3 * 2 - 8 % 3;
         System.out.println("ex7:" + result );

    }

//EX2

    public static int addingup  ( int number1 , int number2 ){

    int result = number1 + number2;

    return result;

    }

    public static int decreasing ( int number3 , int number4){

    int result = number3 - number4;

    return result;






    }
}
