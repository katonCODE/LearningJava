/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeetCode;

import java.util.HashMap;

/**
 *
 * @author daniel
 */
public class TwoSum {

    class Solution {

        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> NumberChecker = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (NumberChecker.containsKey(target - nums[i])) {
                    return new int[]{i, NumberChecker.get(target - nums[i])};

                } else {
                    NumberChecker.put(nums[i], i);
                }

            }

            return new int[]{};

        }
    }

}
