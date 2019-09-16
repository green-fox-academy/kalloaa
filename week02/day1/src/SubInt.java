import java.lang.reflect.Array;
import java.util.Arrays;

/*public class SubInt {
    public static void subInt (int number, int ... array){
        String numstring = String.valueOf(number);
        for (int i = 0; i <array.length ; i++) {
            if (i==0){
                System.out.print("[");
            }
            String num =String.valueOf(array[i]);
            if (num.contains(numstring)){
                System.out.print(array[i]+ " ");
            }
            if (i==array.length-1){
                System.out.print("]");
            }

        }
    }
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        subInt(1, new int[] {1, 11, 34, 52, 61});
        //  should print: `[0, 1, 4]`
        subInt(9, new int[] {1, 11, 34, 52, 61});
        //  should print: '[]'



    }
}
not the wanted solution as it doesnt return anything

*/
public class SubInt {
    public static int[]subInt(int number, int ...numray){
        String numstring = String.valueOf(number);
        int counter = 0;
        for (int i = 0; i < numray.length ; i++) {
            String temp =String.valueOf(numray[i]);
            if (temp.contains(numstring)){
                counter++;
            }
        }
//        int [] output = new int[counter];
//        for (int j = 0; j <counter ; j++) {
//         for (int i = 0; i < numray.length ; i++) {
//             int asd = 0;
//            String temp = String.valueOf(numray[i]);
//            if (temp.contains(numstring)) {
//                output[asd] = i;
//                asd++;
//                }
//             break;
//         }
//        }
        int [] output = new int[counter];
        int asd =  0;
        int fuckthis =0;
        while(asd<counter){
            for (int i = 0+fuckthis; i <numray.length ; i++) {
                String temp = String.valueOf(numray[i]);
                if (temp.contains(numstring)){
                    output[asd]=i;
                    fuckthis=i;
                    asd++;
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));
        //  should print: '[]'
    }
}