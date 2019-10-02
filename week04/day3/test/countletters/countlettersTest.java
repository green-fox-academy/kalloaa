package countletters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class countlettersTest {
    countletters countletters = new countletters();

    @Test
    void countTheLetters_OneLetterThreeTimes() {
        HashMap<String,Integer> test = new HashMap<>();
        test.put("A",3);
        assertEquals(test,countletters.countTheLetters("AAA"));
    }
    @Test
    void countTheLetters_String1() {
        HashMap<String,Integer> test = new HashMap<>();
        test.put("A",1);
        test.put("S",1);
        test.put("D",1);
        assertEquals(test,countletters.countTheLetters("ASD"));
    }

    @Test
    void countTheLetters_String() {
        HashMap<String,Integer> test = new HashMap<>();
        test.put("A",2);
        test.put("S",1);
        test.put("D",1);
        assertEquals(test,countletters.countTheLetters("ASDA"));
    }

}