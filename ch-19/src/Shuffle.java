import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6};
        shuffle(integers);
        System.out.println(Arrays.toString(integers));
    }

    public static <E> void shuffle(E[] list) {
        for(int i = 0; i < list.length; i++) {
            E o = list[i];
            int newIndex = new Random().nextInt(list.length);

            E temp = list[newIndex];
            list[i] = temp;
            list[newIndex] = o;
        }
    }
}
