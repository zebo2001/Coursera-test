package Homework0;

public class Task4ConvertMeter {
    public static void main(String[] args) {
        int meter = 6;

        double valueOfFoot = 3.281;
        int valueOfCentimeter = 100;

        double foot = meter * valueOfFoot;
        int centimeter = meter * valueOfCentimeter;

        System.out.println("6 meters = " + foot + " feet " + " \n6 meters = " + centimeter + " centimeters");

    }
}
