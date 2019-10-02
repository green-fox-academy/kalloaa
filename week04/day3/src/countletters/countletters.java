package countletters;

import java.util.HashMap;

public class countletters {
    public HashMap countTheLetters(String string){
        HashMap<String,Integer> result = new HashMap<String, Integer>();
        String[] letters = string.split("");
        for (int i = 0; i <letters.length ; i++) {
            boolean addedToValue = true;
            for (int letterIndex = 0; letterIndex <letters.length ; letterIndex++) {
                if(result.containsKey(letters[letterIndex])){
                    int temp =result.get(letters[letterIndex]);
                    temp++;
                    result.replace(letters[i],temp);
                    addedToValue=false;
                }
            }
            if(addedToValue) {
                result.put(letters[i], 1);
            }

        }
        return result;
    }
}
