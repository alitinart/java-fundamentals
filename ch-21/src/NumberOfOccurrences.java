import java.util.*;

/**
 *
 * *21.6 (Count the occurrences of numbers entered)

 * Write a program that reads an
 * unspecified number of integers and finds the one that has the most occurrences.
 * The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3
 * 3320, the number 3 occurred most often. If not one but several numbers have
 * the most occurrences, all of them should be reported. For example, since 9 and 3
 * appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported.
 *
 */
public class NumberOfOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (input ends with 0): ");
        Map<Integer, Integer> hashMap = new HashMap<>();

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if(num == 0) {
                break;
            }

            if(!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
                continue;
            }

            int currValue = hashMap.get(num);
            currValue++;
            hashMap.put(num, currValue);
        }

        HashMap<Integer, Integer> mostRepeated = new HashMap<>();
        Map.Entry<Integer, Integer> current = new AbstractMap.SimpleEntry<Integer, Integer>(0,0);;

        for(Map.Entry<Integer, Integer> o : hashMap.entrySet()) {
            if (o.getValue() > current.getValue()) {
                current = o;
                mostRepeated.clear();
                continue;
            }

            if (Objects.equals(o.getValue(), current.getValue())){
                mostRepeated.put(o.getKey(), o.getValue());
            }
        }

        mostRepeated.put(current.getKey(), current.getValue());

        System.out.println(hashMap);
        System.out.println("Top repeated numbers: ");
        System.out.println(mostRepeated);
    }
}
