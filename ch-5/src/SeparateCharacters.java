/**
 *
 * Separate Characters

 * Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display ten characters per line. The ASCII
 * table is shown in Appendix B. Characters are separated by exactly one space.
 *
 */
public class SeparateCharacters {
    public static void main(String[] args) {
        int count = 0;
        for (char c = '!'; c <= '~'; c++) {
            System.out.print(c + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
