import java.util.Arrays;

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println((reverse(reversed)));
    }
    public static String reverse (String strToBeRev){
        char[] chararr =strToBeRev.toCharArray();
        char[] tempchar = new char[chararr.length];
        int counter =chararr.length-1;
        for (int i = 0; i <chararr.length ; i++) {
            tempchar[counter] =chararr[i];
            counter--;
        }
        String output = new String();
        for (int i = 0; i <tempchar.length ; i++) {
            output+= String.valueOf(tempchar[i]);

        }
        return output;
    }
}