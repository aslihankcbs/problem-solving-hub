package io.aslihankcbs.valid_palindrome;

public class ValidPalindromeSolution {
    public boolean isPalindrome(String s) {
        if (s == null)
            return false;

        /*
          Approach 1: Compare with Reverse
          Time Complexity O(n)
          Space Complexity O(n) -> StringBuilder

        StringBuilder builder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();
        return filteredString.equals(reversedString);
        */

        /*
          Approach 2: Two Pointers
          Time Complexity O(n)
          Space Complexity O(1)
        */

        for (int first = 0, last = s.length() - 1; first < last; first++, last--) { // // initialize two pointers, one at the start and one at the end of the string
            while (first < last && !Character.isLetterOrDigit(s.charAt(first))) { // move first forward until a letter or digit is found
                first++;
            }
            while (first < last && !Character.isLetterOrDigit(s.charAt(last))) { // move last backward until a letter or digit is found
                last--;
            }

            // compare the characters at first and last after converting them to lowercase
            if (Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last)))
                return false;
        }
        return true; // if the two pointers have crossed over, the string is a palindrome
    }
}
