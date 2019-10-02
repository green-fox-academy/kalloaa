package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram anagram = new Anagram();

    @Test
    void isAnagram_true() {
       boolean test =anagram.isAnagram("true","treu");
        assertTrue(test);
    }
    @Test
    void isAnagram_false() {
        boolean test =anagram.isAnagram("true","false");
        assertFalse(test);
    }
}