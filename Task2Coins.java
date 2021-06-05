package Project2;

public class Task2Coins {
    public static void main(String[] args) {

        int quarters = 25;
        double dimes = 10;
        double nickels = 5;
        double pennies = 1;

        double myAmount = 2.36;
        int myBalance = (int) (myAmount * 100); //got rid of the decimal points for it to be integer. Java would not comprehend with double numbers

        int totalQuarters = ((int) (myBalance / quarters));
        System.out.println("Quarters " + totalQuarters);

        int totalDimes = (int) ((myBalance - (totalQuarters * quarters)) / dimes);
        System.out.println("Dimes " + totalDimes);

        int totalNickels = (int) ((myBalance - (totalQuarters * quarters) - (totalDimes * dimes)) / nickels);
        System.out.println("Nickels " + totalNickels);

        int totalPennies = (int) ((myBalance - ((totalQuarters * quarters) + (totalDimes * dimes) + (totalNickels * nickels))) / pennies);
        System.out.println("Pennies " + totalPennies);

    }
}