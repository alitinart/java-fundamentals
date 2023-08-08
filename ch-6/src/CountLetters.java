/**
 *
 * *6.20 Count letters in string

 * Write a method that counts the number of letters in
 * a string using the following header:
 * public static int countLetters(String s)
 * Write a test program that prompts the user to enter a string and displays the number of letters in the string.
 *
 */
public class CountLetters {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
        int letterCount = countLetters(inputString);
        System.out.println("The number of letters in the string: " + letterCount);
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
}
