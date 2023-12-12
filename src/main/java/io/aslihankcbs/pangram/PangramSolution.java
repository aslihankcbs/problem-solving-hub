package io.aslihankcbs.pangram;

public class PangramSolution {
    public boolean checkIfPangram(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return false;
        }
        boolean[] mark = new boolean[26];
        sentence = sentence.toLowerCase(java.util.Locale.ENGLISH);
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                mark[index] = true;
            }
        }

        for (boolean status : mark) {
            if (!status) {
                return false;
            }
        }
        return true;
    }
}