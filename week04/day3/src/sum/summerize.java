package sum;

import java.util.ArrayList;

public class summerize {

    public int summerize(ArrayList<Integer> myNumbers) {
        int sum = 0;
        for (int i = 0; i < myNumbers.size(); i++) {
            sum += myNumbers.get(i);
        }
        return sum;
    }
}
