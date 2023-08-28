package algorthim;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 9, 5, 4, 8, 1, 7, 6};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void bubbleSort(int[] list) {
        for(int k = 1; k < list.length; k++) {
            for(int i = 0; i < list.length - k; i++) {
                if(list[i] > list[i + 1]) {
                    int temp = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = temp;
                }
            }
        }
    }
}
