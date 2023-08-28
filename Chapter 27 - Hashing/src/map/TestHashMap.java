package map;

public class TestHashMap {
    public static void main(String[] args) {
        MyMap<String, String> map = new MyHashMap<>();
        map.put("Texas", "Dallas");
        map.put("Oklahoma", "Norman");
        map.put("Texas", "Austin");
        map.put("Oklahoma", "Tulsa");
        System.out.println(map.get("Texas"));
        System.out.println(map.size());
    }
}
