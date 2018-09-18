package days.fourth;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> name = new LinkedHashMap<>();

        name.put(2, "pukis");
        name.put(1, "nezinau");
        name.put(3, "cigonas");
        name.put(1, "koldunas");
        for (Integer key : name.keySet()){
            System.out.println("Key" + key + " values:" + name.get(key));
        }

    }
}
