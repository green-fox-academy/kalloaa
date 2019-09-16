import java.util.Arrays;

public class unique {
    public static int[] unique (int...all){
        //getting the amount of unique numbers
        int numberOfUnique =0;
        for (int i = 0; i <all.length ; i++) {

            //checking when they are unique
            int checkedInt =all[i];
            boolean intseen = false;
            for (int j = 0; j < i ; j++) {
               if (checkedInt==all[j] && all[i] ==all[j]){
                   intseen=true;
               }

            }
            if (intseen==false){
                numberOfUnique++;
            }
        }
        int[] output = new int[numberOfUnique];
        int counter =0;
        while (counter<numberOfUnique){
            for (int i = 0; i <all.length ; i++) {
                int checkedInt =all[i];
                boolean intseen = false;
                for (int j = 0; j <i ; j++) {
                    if (checkedInt==all[j] && all[i] ==all[j]){
                        intseen=true;
                    }

                }
                if (intseen==false){
                    output[counter]=all[i];
                    counter++;
                }
            }
        }


    return output;
    }
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(Arrays.toString(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34})));
        //  should print: `[1, 11, 34, 52, 61]`
    }
}