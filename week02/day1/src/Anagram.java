import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
     public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }
    public static String compare (String string1,String string2){
         String output;
         if (string1.equals(string2)){
             output="The 2 words are Anagrams";
         }
         else{
             output="The 2 words are NOT Anagrams";
         }
         return output;

    }
    public static void main(String[] args) {
//
//        Create a function named is anagram following your current language's style guide. It should take two strings and return a boolean value depending on whether its an anagram or not.
//        Examples
//        input 1 	input 2 	output
//        "dog" 	"god" 	true
//        "green" 	"fox" 	false
        System.out.println("type in a word and then its anagram");
        Scanner scanner = new Scanner(System.in);
        String ana1 = scanner.next(); //dog
        String ana2 = scanner.next(); //god

        ana1 = sortString(ana1);
        ana2 = sortString(ana2);
        System.out.println(compare(ana1,ana2));
    }
}
