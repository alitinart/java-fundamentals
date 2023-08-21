public class BinarySearch {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Index of key is: " + binarySearch(integers, 4));
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int low = 0;
        int high = list.length - 1;
        boolean found = false;
        int keyIndex = -1;

        while(!found) {
            int mid = (low + high) / 2;
            if(list[mid].compareTo(key) == 0) {
                keyIndex = mid;
                found = true;
            } else if (list[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return keyIndex;
    }
}
