package Homework4;

public class Task4 {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        int total = b++ - --a * a++ + b - a + ++a + ++b%a + --a + ++b ;

        System.out.println(a);
        System.out.println(b);
        System.out.println("Total: "+total);
    }
}
