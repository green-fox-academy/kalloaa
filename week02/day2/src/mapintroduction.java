import java.util.HashMap;
import java.util.Map;

public class mapintroduction {
    public static void main(String[] args) {
        Map <Integer, String> hm = new HashMap<Integer, String>();
        System.out.println(hm);
        System.out.println(hm.isEmpty());
        hm.put(97, "a");
        hm.put(98,"b");
        hm.put(99,"c");
        hm.put(65,"A");
        hm.put(66,"B");
        hm.put(67,"C");
        for (Integer key: hm.keySet()) {
            System.out.println(key );
        }
        for (Integer key: hm.keySet()) {
            System.out.println(hm.get(key) );
        }
        hm.put(68,"D");
        System.out.println(hm.size());
        System.out.println(hm.get(97));
        System.out.println(hm.remove(97));
        System.out.println(hm.containsKey(100));
        for (Integer key: hm.keySet()) {
            hm.remove(key);
        }
    }
}
