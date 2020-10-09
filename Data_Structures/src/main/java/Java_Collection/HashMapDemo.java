package Java_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(100, "Alice");
        map.put(212, "Hussain");
        map.put(356, "Shernik");
        //map.put(100,"Motahharul haque");//override the existing value belongs to that key.
        System.out.println(map.get(100));
        map.remove(356);

        for (Map.Entry m: map.entrySet()) {
            System.out.println("Key :"+m.getKey()+", value :"+m.getValue());
        }
    }
}
