import java.util.ArrayList;
import java.util.Arrays;

public class listintro2 {
    public static void main(String[] args) {
        ArrayList<String>listaa =new ArrayList<>();
        listaa.addAll(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        ArrayList<String>listab = new ArrayList<>();
        listab.addAll(listaa);
        listaa.contains("Durian");
        listaa.add(4,"Kiwifruit");
        System.out.println(listaa.size());
        System.out.println(listab.size());
        listaa.indexOf("Avocado");
        listab.indexOf("Durian");
        listab.addAll(Arrays.asList("Passion Fruit","Pomelo"));
        System.out.println(listaa.get(3));
    }
}
