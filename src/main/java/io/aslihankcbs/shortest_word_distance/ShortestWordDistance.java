package io.aslihankcbs.shortest_word_distance;

public class ShortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int indexWord1 = -1;
        int indexWord2 = -1;
        int distance = words.length;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                indexWord1 = i;
            } else if (word.equals(word2)) {
                indexWord2 = i;
            }

            if (indexWord1 != -1 && indexWord2 != -1) {
                distance = Math.min(distance, Math.abs(indexWord1 - indexWord2));
            }
        }

        return distance;
    }
}
