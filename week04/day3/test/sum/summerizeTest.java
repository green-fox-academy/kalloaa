package sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class summerizeTest {
    summerize summerize = new summerize();


    @Test
    void summerize_empty() {
        ArrayList<Integer> test = new ArrayList<>();
        int result= summerize.summerize(test);
        assertEquals(result,0);
    }
    @Test
    void summerize_withnumbers(){
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(3,170,9));
        int result = summerize.summerize(test);
        assertEquals(result,182);
    }
}