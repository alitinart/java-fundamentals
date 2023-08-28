import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Split

 * The split method in the String class returns an
 * array of strings consisting of the substrings split by the delimiters. However, the
 * delimiters are not returned. Implement the following new method that returns
 * an array of strings consisting of the substrings split by the matching delimiters,
 * including the matching delimiters.
 * public static String[] split(String s, String regex)
 * For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
 * array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
 * #, and e in an array of String.
 *
 */
public class Split {
    public static String[] split(String s, String regex) {
        char[] charList = s.toCharArray();
        int charIndex = 0;
        int splitCount = 0;

        for (char c : charList) {
            if (regex.indexOf(c) != -1) {
                splitCount++;
            }
        }
        splitCount++;

        String[] splittedText = new String[splitCount];
        int arrayIndex = 0;

        for (int i = 0; i < charList.length; i++) {
            char currentChar = charList[i];
            if (regex.indexOf(currentChar) != -1) {
                if (i > charIndex) {
                    splittedText[arrayIndex++] = s.substring(charIndex, i);
                }
                splittedText[arrayIndex++] = String.valueOf(s.charAt(i));
                charIndex = i + 1;
            }
        }

        if (charIndex < s.length()) {
            splittedText[arrayIndex] = s.substring(charIndex);
        }

        System.out.println(Arrays.toString(splittedText));
        return splittedText;
    }

    public static void main(String[] args) {
        split("\"ab#12#453", "#");
    }
}
