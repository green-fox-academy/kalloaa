import java.util.ArrayList;

public class listIntro {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));
        }
        names.remove(1);
        names.get(1);
        names.get(0);
        names.removeAll(names);
    }
}
