package io.aslihankcbs.reverse_vowels;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsSolution {
    public String reverseVowels(String s) {
        if (s == null || s.isEmpty() || s.length() == 1) {
            return s;
        }

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] arr = s.toCharArray();
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            while (first < last && isNotVowel(arr[first], vowels)) {
                first++;
            }

            while (first < last && isNotVowel(arr[last], vowels)) {
                last--;
            }

            if (first < last) {
                char temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
        }

        return new String(arr);
    }

    private boolean isNotVowel(char c, Set<Character> vowels) {
        return !vowels.contains(c);
    }
}
