package Homework1;

public class Task2Pseudocode {
    public static void main(String[] args) {
        int result=4*7+3-2*9%5/3-2;
        /* You need to do multiplication and division first;Start from the left and
        work across to the right;
        #1 start with: 4*7=28
        #2 then we do second multiplication from left to right: 2*9=18
        #3 we divide the result of #2 multiplication: 18%5=3
        #4 the quotient of #3 divide by  divisor:3/3=1
        Now you are finished with multiplication and division.
        Subtraction and Addition rank equally,simply work from left to right
        #5 28+3=31 (28 came from first multiplication 4*7=28)
        #6 31-1=30  (1 came from step4)
        #7 30-2=28
         */







        int result1=12-3/3+4-2*2%4+12%3/3;

        /*You need to do multiplication and division first;Start from the left and
        work across to the right;
        #1 we do division first: 3/3=1
        #2 we do multiplication : 2*2=4
        #3 divide the result by divisor: 4/4=1
        // continue going left to right until you finish with multiplication and division
        #4  we do next division: 12%3=4 (since it is a "int" data type it stays as a whole number)
        #5  divide the quotient by divisor: 4/3=1 (since it is a "int" data type it stays as a whole number)
        //Now time for addition and subtraction
        #6 first subtraction from left: 12-1=11 (1 came from first division)
        #7 next goes addition: 11+4= 15
        #8 15-1=14 (1 came from 2*2/4)
        #9 14+1=15 (1 came from 12%3/3)
         */


        System.out.println("Result: " + result+"\nResult1: "+result1);
    }
}
