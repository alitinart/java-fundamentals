import java.util.Scanner;

/**
 *
 * Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is number character 1, 2, 3, 4, which
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * the following characters are used to denote the majors:
 *
 */
public class StudentMajor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String majorAndStatus = scanner.nextLine();

        scanner.close();

        char major = majorAndStatus.charAt(0);
        char status = majorAndStatus.charAt(1);

        String majorAndStatusResults = "";

        switch (major) {
            case 'M' -> majorAndStatusResults += "Mathematics ";
            case 'C' -> majorAndStatusResults += "Computer Science ";
            case 'I' -> majorAndStatusResults += "Information Technology ";
            default -> throw new RuntimeException("Enter valid major !");
        }

        switch (status) {
            case '1' -> majorAndStatusResults += "Freshman";
            case '2' -> majorAndStatusResults += "Sophomore";
            case '3' -> majorAndStatusResults += "Junior";
            case '4' -> majorAndStatusResults += "Senior";
            default -> throw new RuntimeException("Enter valid status !");
        }

        System.out.println(majorAndStatusResults);
    }
}
