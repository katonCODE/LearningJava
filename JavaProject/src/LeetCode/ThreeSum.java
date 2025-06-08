package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*This question was quite hard. It involves setting one number as a anchor and performing two sum. 
a lot of the difficulty lies in the need of needing to handle duplicate values. This also re-enforced my understanding
of how two-sum can be solved with a two pointer solution
 */

public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> toReturn = new ArrayList<>();
            Arrays.sort(nums);
            for (int target = 0; target < nums.length; target++) {
                if (target > 0 && nums[target] == nums[target - 1]) {
                    continue;
                }

                int left = target + 1;
                int right = nums.length - 1;

                while (left < right) {

                    int sum = nums[target] + nums[left] + nums[right];

                    if (sum == 0) {
                        toReturn.add(Arrays.asList(nums[target], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (0 > sum) {
                        left++;
                    } else if (0 < sum) {
                        right--;
                    }

                }
            }
            return toReturn;
        }
    }

}
