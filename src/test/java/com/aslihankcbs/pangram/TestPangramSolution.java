package com.aslihankcbs.pangram;

import io.aslihankcbs.pangram.PangramSolution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestPangramSolution {

    @ParameterizedTest
    @ValueSource(strings = {
            "The quick brown fox jumps over the lazy dog",
            "Pack my box with five dozen liquor jugs",
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    })
    void testPangramWithValidSentence(String sentence) {
        PangramSolution pangramSolution = new PangramSolution();
        assertTrue(pangramSolution.checkIfPangram(sentence));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {
            "This is not a pangram",
    })
    void testPangramWithInvalidOrEmptySentence(String sentence) {
        PangramSolution pangramSolution = new PangramSolution();
        assertFalse(pangramSolution.checkIfPangram(sentence));
    }
}