package LeetCode;

public class MaximumDifferenceIncreasingElements {
    class Solution {
        public int maximumDifference(int[] nums) {
            int toReturn = -1;
            int currentMinimum = nums[0];

            for (int i = 0; i < (nums.length); i++) {
                if (nums[i] < currentMinimum) {
                    currentMinimum = nums[i];
                } else {
                    if (toReturn < nums[i] - currentMinimum) {
                        toReturn = nums[i] - currentMinimum;
                    }
                }
            }

            if (toReturn < 1) {
                toReturn = -1;
            }
            return toReturn;

        }
    }

}
