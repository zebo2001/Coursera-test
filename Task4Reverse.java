package Project2;

public class Task4Reverse {
    public static void main(String[] args) {

        int mainNumber = 53876;
        int digitFive = mainNumber%10;
        System.out.println(digitFive);
        mainNumber=mainNumber/10;
        int digitFour = mainNumber%10;
        System.out.println(digitFour);
        mainNumber=mainNumber/10;
        int digitThree = mainNumber%10;
        System.out.println(digitThree);
        mainNumber=mainNumber/10;
        int digitTwo = mainNumber%10;
        System.out.println(digitTwo);
        mainNumber=mainNumber/10;
        int digitOne = mainNumber%10;
        System.out.println(digitOne);
        mainNumber = mainNumber/10;

        System.out.println("the reverse output is: " +digitFive+digitFour+digitThree+digitTwo+digitOne);




}

}
