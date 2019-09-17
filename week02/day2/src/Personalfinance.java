import java.util.ArrayList;
import java.util.Arrays;

public class Personalfinance {
    public static void main(String[] args) {
//        We are going to represent our expenses in a list containing integers.
//
//        Create a list with the following items.
//        500, 1000, 1250, 175, 800 and 120
//        Create an application which solves the following problems.
//        How much did we spend?
//                Which was our greatest expense?
//        Which was our cheapest spending?
//                What was the average amount of our spendings?

        ArrayList<Integer> lista = new ArrayList<>();
        lista.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        int listmax = 0;
        int least = 2000;
        int most = 0;
        for (int i = 0; i <lista.size() ; i++) {
            listmax+=lista.get(i);
            if(least> lista.get(i)){
                least=lista.get(i);
            }
            if (most<lista.get(i)){
                most=lista.get(i);
            }
        }
        System.out.println(" we spent: " + listmax +"\n our greatest expense: " + most + "\n our cheapest spending: " + least
        + "\n the average was: " + listmax/lista.size());
    }
}
