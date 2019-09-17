import java.util.HashMap;
import java.util.Map;

public class telephonebook {
    public static void main(String[] args) {
//        We are going to represent our contacts in a map where the keys are going to be strings and the values are going to be strings as well.
//
//        Create a map with the following key-value pairs.
//                Name (key) 	Phone number (value)
//                William A. Lathan 	405-709-1865
//        John K. Miller 	402-247-8568
//        Hortensia E. Foster 	606-481-6467
//        Amanda D. Newland 	319-243-5613
//        Brooke P. Askew 	307-687-2982
//
//        Create an application which solves the following problems.
//        What is John K. Miller's phone number?
//        Whose phone number is 307-687-2982?
//                Do we know Chris E. Myers' phone number?

        Map<String,String> hm = new HashMap<String,String>();
        hm.put("William A. Lathan","405-709-1865");
        hm.put("John K. Miller","402-247-8568");
        hm.put("Hortensia E. Foster","606-481-6467");
        hm.put("Amanda D. Newland","319-243-5613");
        hm.put("Brooke P. Askew","307-687-2982");
        for (Map.Entry<String,String> obj: hm.entrySet()) {
            if (obj.getKey().equals("John K. Miller")){
                System.out.println(obj.getValue());
            }
            if (obj.getValue().equals("307-687-2982")){
                System.out.println(obj.getKey());
            }
        }
        System.out.println(hm.containsKey("Chris E. Myers"));

    }
}
