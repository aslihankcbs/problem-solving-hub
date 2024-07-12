package io.aslihankcbs.valid_anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagramSolution {
    // Solution one:
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    // Solution two:
    // we can count frequency of characters
    // Over all time complexity is O(n). n is the length of the strings. We are iterating strings once.
    // We use 3 for loop but complexity still O(n) because there are not nested loop!
    // We can decrease loop count using first 2 loop in the same loop.

    // space complexity O(1) because hashmap size would be 26 (max) !
    public boolean isAnagram2(String s, String t) {
        // questions!
        // s and t's length is same right!

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch: s.toCharArray()) {
            // increment freq of the character in s
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        } // time complexity O(n)

        for (char ch: t.toCharArray()) {
            // decrement freq of the character in t
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) - 1);
        } // time complexity O(n)


        // time complexity O(n)
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
         }
        return true;
    }
}
