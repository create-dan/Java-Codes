import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class first {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<>(); // list = vector
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("List: " + list);

        // Set
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("Set: " + set);

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Map: " + map);
    }
}
