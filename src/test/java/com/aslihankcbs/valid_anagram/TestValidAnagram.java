package com.aslihankcbs.valid_anagram;

import io.aslihankcbs.valid_anagram.ValidAnagramSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestValidAnagram {

    @Test
    void testIsAnagram() {
        ValidAnagramSolution validAnagramSolution = new ValidAnagramSolution();
        assertFalse(validAnagramSolution.isAnagram2("rat", "car"));
        assertTrue(validAnagramSolution.isAnagram2("listen", "silent"));
        assertTrue(validAnagramSolution.isAnagram2("", ""));
        assertTrue(validAnagramSolution.isAnagram2("anagram", "nagaram"));
        assertFalse(validAnagramSolution.isAnagram2("hello", "world"));
    }
}
