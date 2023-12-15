package com.aslihankcbs.reverse_vowels;

import io.aslihankcbs.reverse_vowels.ReverseVowelsSolution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestReverseVowelsSolution {

    @ParameterizedTest
    @CsvSource({
            // Test case 1: Empty string
            "'', '',",

            // Test case 2: Single character
            "a, a",

            // Test case 3: No vowels
            "xyz, xyz",

            // Test case 4: Vowels only
            "aeiouAEIOU, UOIEAuoiea",

            // Test case 5: Consonants and vowels
            "hello world, hollo werld",

            // Test case 6: Mixed case vowels
            "AbCdEfGhIjOu, ubCdOfGhIjEA"
    })
    void testReverseVowels(String input, String expected) {
        ReverseVowelsSolution reverseVowelsSolution = new ReverseVowelsSolution();
        String result = reverseVowelsSolution.reverseVowels(input);
        assertEquals(expected, result);
    }
}
