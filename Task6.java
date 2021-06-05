package Homework1;

public class Task6 {
    public static void main(String[] args) {
        double salary=200_000;
        double bonus1=(salary*0.5)*0.05;
        double bonus2=(salary*0.3)*0.08;
        double bonus3=(salary*0.2)*0.10;
        double totalBonus=bonus1+bonus2+bonus3;
        System.out.println("Total bonus: "+totalBonus);

    }
}
