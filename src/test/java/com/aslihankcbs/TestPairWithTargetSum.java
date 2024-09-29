package com.aslihankcbs;

import io.aslihankcbs.pair_with_target_sum.PairWithTargetSum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestPairWithTargetSum {

    @Test
    @DisplayName("Test search with happy path")
    void testSearch() {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        assertArrayEquals(new int[]{1, 3}, PairWithTargetSum.search(arr, target));
    }

    @Test
    @DisplayName("Test search with no pair")
    void testSearchNoPairFound() {
        int[] arr = {1, 2, 3, 4, 10};
        int target = 10;
        assertArrayEquals(new int[]{-1, -1}, PairWithTargetSum.search(arr, target));
    }

    @Test
    @DisplayName("Test search with empty array")
    void testSearchEmptyArray() {
        int[] arr = {};
        int target = 6;
        assertArrayEquals(new int[]{-1, -1}, PairWithTargetSum.search(arr, target));
    }

    @Test
    @DisplayName("Test search with single element")
    void testSearchWithSingleElement() {
        int[] arr = {5};
        int target = 5;
        assertArrayEquals(new int[]{-1, -1}, PairWithTargetSum.search(arr, target));
    }

    @Test
    @DisplayName("Test search with all elements same")
    void testSearchWithAllElementsSame() {
        int[] arr = {2, 2, 2, 2};
        int target = 4;
        assertArrayEquals(new int[]{0, 3}, PairWithTargetSum.search(arr, target));
    }

    @Test
    @DisplayName("Test search with negative elements")
    void testSearchWithNegativeElements() {
        int[] arr = {-3, -1, 0, 1, 2};
        int target = -2;
        assertArrayEquals(new int[]{0, 3}, PairWithTargetSum.search(arr, target));
    }
}