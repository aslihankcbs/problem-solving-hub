package com.aslihankcbs.valid_palindrome;

import io.aslihankcbs.valid_palindrome.ValidPalindromeSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestValidPalindromeSolution {

    @Test
    void testIsPalindrome() {
        ValidPalindromeSolution checker = new ValidPalindromeSolution();

        // Test with palindromic string
        assertTrue(checker.isPalindrome("racecar"));

        // Test with non-palindromic string
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("raceacar"));

        // Test with empty string
        assertTrue(checker.isPalindrome(""));

        // Test with null string
        assertFalse(checker.isPalindrome(null));

        // Test with palindromic string with spaces and special characters
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama!"));

        // Test with non-palindromic string with spaces and special characters
        assertFalse(checker.isPalindrome("This is not a palindrome"));
    }
}