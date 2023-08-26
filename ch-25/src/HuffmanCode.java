import org.w3c.dom.Node;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HuffmanCode {

    public static void main(String[] args) {
        HuffmanEncode("MISSISSPI");
    }

    public static void HuffmanEncode(String s) {
        HashMap<Character, Integer> letters = new LinkedHashMap<>();

        for(Character c: s.toCharArray()) {
            if(letters.containsKey(c)) {
                int currentValue = letters.get(c) + 1;
                letters.put(c, currentValue);
            } else {
                letters.put(c, 1);
            }
        }

        Heap<Integer> heap = new Heap<>();
        for(Map.Entry<Character, Integer> e: letters.entrySet()) {
            heap.add(e.getValue());
        }

    }
}
