/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeetCode;

import java.util.HashSet;

/**
 *
 * @author daniel
 */
public class ContainsDuplicate {

    class Solution {

        public boolean containsDuplicate(int[] nums) {

            HashSet<Integer> UniqueNums = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {
                if (!UniqueNums.add(nums[i])) {
                    return true;

                }
            }

            return false;

        }

    }
}
