package anagram;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String word1,String word2){
        String[]wordarray1=word1.split("");
        String[]wordarray2=word2.split("");
        Arrays.sort(wordarray1);
        Arrays.sort(wordarray2);
        return Arrays.equals(wordarray1, wordarray2);
    }
}
