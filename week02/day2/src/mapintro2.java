import java.util.HashMap;
import java.util.Map;

public class mapintro2 {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>();
        hm.put("978-1-60309-452-8", "A Letter to Jo");
        hm.put("978-1-60309-459-7", "Lupus");
        hm.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        hm.put("978-1-60309-461-0", "The Lab");

        for (String key : hm.keySet()) {
            System.out.println(hm.get(key) + "(ISBN:" + key + ")");
        }
        hm.remove("978-1-60309-444-3");
        hm.remove("The Lab");
        hm.put("978-1-60309-450-4","They Called Us Enemy");
        hm.put("978-1-60309-453-5","Why Did We Trust Him?");
        System.out.println(hm);
        if(hm.get("78-0-61159-424-8")==null){
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }
        System.out.println(hm.get("978-1-60309-453-5"));
    }
}
