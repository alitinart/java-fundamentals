/**
 *
 * Case Study: Sorting an array of comparable objects
 *
 */
public class ComparableSort {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {3.4,1.3,-22.1};
        Character[] charArray = {'a', 'j', 'r'};
        String[] stringArray = {"Tom", "Susan", "Kim"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.println("Sorted Integer array: ");
        printList(intArray);
        System.out.println("Sorted Double array: ");
        printList(doubleArray);
        System.out.println("Sorted Char array: ");
        printList(charArray);
        System.out.println("Sorted String array: ");
        printList(stringArray);
    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for(int i = 0; i < list.length; i++) {
            currentMin = list[i];
            currentMinIndex = i;

            for(int j = i + 1; j < list.length; j++){
                if(currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list) {
        for (Object o : list) System.out.print(o + " ");
        System.out.println();
    }
}
