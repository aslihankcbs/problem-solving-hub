package io.aslihankcbs.pair_with_target_sum;

public class PairWithTargetSum {
    public static int[] search(int[] arr, int targetSum) {
        int startPointer = 0;
        int endPointer = arr.length - 1;

        while (startPointer < endPointer) {
            int total = arr[startPointer] + arr[endPointer];
            if (total < targetSum) {
                startPointer++;
            } else if (total > targetSum) {
                endPointer--;
            } else {
                return new int[] {startPointer, endPointer};
            }
        }
        return new int[] { -1, -1 };
    }
}
