package apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appleTest {

    @Test
    void apple() {
        String test = apple.apple();
        assertEquals(test,"apple");
    }
}