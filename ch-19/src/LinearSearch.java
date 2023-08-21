public class LinearSearch {
    public static void main(String[] args) {
        Integer[] integers = {1,4,6,3,4,6,8,9,2,11,212};
        System.out.println(max(integers));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E currentMax = list[0];
        for(E o : list) {
            if(currentMax.compareTo(o) < 0) {
                currentMax = o;
            }
        }

        return currentMax;
    }
}
