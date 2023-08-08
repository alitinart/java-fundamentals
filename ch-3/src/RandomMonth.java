import java.util.Random;

/*
*
*   Random Month Selector
*
*   Randomly generate a number from 1 - 12 and display the month associated with that
*   number
*
* */
public class RandomMonth {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(12) + 1;
        System.out.println("Randomly selected month: " + getMonthName(randomNumber));
    }

    public static String getMonthName(int monthNumber) {
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }
}
