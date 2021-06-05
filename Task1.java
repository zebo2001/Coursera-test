package Homework2;

public class Task1 {
    public static void main(String[] args) {
        int k=7;
        int n=3;

        int result = k++ * ++n / ++n % k + n - k++;//7*4/5%8+5-8
        /*
        From left to right we start giving exact value for numbers
        In the Pre-increment, value is first incremented and then used inside the expression;
        In the Post-Increment, value is first used in a expression and then incremented;
        k++ -> still 7,we use old value, since it is a post-increment //now k=8
        ++n -> 4, we add 1 immediately because it is a pre-increment// n=4
                                7*4/...
        ++n -> 5,  we add 1 immediately because it is a pre-increment// n=5
                                7*4/5%...
        k-> 8, 8 is incremented   from first (k++)   //k=8
                                7*4/5%8+...
        n -> 5, stays the same, there is no new given value //n=5
                                7*4/5%8+5-...
        k++ ->8, because of the post-increment k holds latest value, it is not incremented;
                      final:   7 * 4 / 5 % 8 + 5 - 8
        Now do arithmetical operation. You need to do multiplication and division first;Start from the left and
        work across to the right;
                      7*4=28
                      28/5=5 since it is a integer, it gives us a whole number
                      5%8=5 modulus gives us a reminder
         You are done with multiplication and division; So addition and subtraction;
                        5+5=10
                        10-8=2 Result is 2
                               k=9; n=5

         */



        int $result = k + k++ * k - n++ % n + ++n;
        /* since, final value for k=9, n=5 we will use these values
        k -> 9 , there is no new value given, it stays the same
        k++ ->9, it stays as 9 because it a post increment, on the next it will be incremented //k=10
                9+9*...
        k ->10, we use incremented k
                9+9*10-..
        n++ ->5, it stays as 5 because it a post increment, on the next it will be incremented //n=6
                9+9*10-5%..
         n ->6, six if from last increment     //n=6
                 9+9*10-5%6+..
         ++n ->7, since it is a pre increment the value is first incremented//n=7
                 9+9*10-5%6+7;
           Now we do simple arithmetical operation. You need to do multiplication and division first;Start from the left and
        work across to the right;
                9*10=90
                5%6=5 modulus gives us the reminder
           You are done with multiplication and division; So do addition and subtraction;
                9+90=99
                99-5=94
                94+7=101

              $Result is 101
              k=10; n= 7
         */


        System.out.println("Result: "+result);
        System.out.println("$Result: "+$result);
    }
}
