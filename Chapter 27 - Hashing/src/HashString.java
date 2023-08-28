/**
 *
 * **27.9 (Implement hashCode for string)

 * Write a method that returns a hash code for
 * string using the approach described in Section 27.3.2 with b value 31. The function header is as follows:
 * public static int hashCodeForString(String s)
 *
 */
public class HashString {
    public static void main(String[] args) {
        System.out.println(hashCodeForString("Hello"));
        System.out.println("Hello".hashCode());
    }

    public static int hashCodeForString(String s) {
        int h = 0;

        for (char c: s.toCharArray()) {
            h = 31 * h + c;
        }

        return h;
    }
}
