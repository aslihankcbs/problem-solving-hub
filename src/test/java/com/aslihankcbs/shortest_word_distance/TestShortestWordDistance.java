package com.aslihankcbs.shortest_word_distance;

import io.aslihankcbs.shortest_word_distance.ShortestWordDistance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestShortestWordDistance {

    @Test
    void testShortestWordDistance() {
        ShortestWordDistance shortestWordDistance = new ShortestWordDistance();
        String[] words = {"the","quick","brown","fox","jumps","over","the","lazy","dog"};
        String word1 = "fox";
        String word2 = "dog";
        assertEquals(5, shortestWordDistance.shortestDistance(words, word1, word2));

        String[] words2 = {"a", "c", "d", "b", "a"};
        String word11 = "a";
        String word22 = "b";
        assertEquals(1, shortestWordDistance.shortestDistance(words2, word11, word22));

        String[] words3 = {"repeated", "words", "in", "the", "array", "words"};
        String word111 = "repeated";
        String word222 = "words";
        assertEquals(1, shortestWordDistance.shortestDistance(words3, word111, word222));

        String[] letters = {"a", "c", "d", "b", "a"};
        String a = "a";
        String b = "b";
        assertEquals(1, shortestWordDistance.shortestDistance(letters, a, b));
    }
}
