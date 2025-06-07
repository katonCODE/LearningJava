package MoreDSA;

import java.util.HashMap;

public class TwoNumberSumProblem {

    static int[] FindSum(int arr[], int target) {

        int[] toReturn = { 0, 0 };

        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (numbers.containsKey(target - arr[i])) {

                toReturn[1] = i;
                toReturn[0] = numbers.get(target - arr[i]);

                return toReturn;
            }
            numbers.put(arr[i], i);
        }

        return toReturn;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };

        int[] ans = FindSum(arr, 9);

        for (int nums : ans) {
            System.out.println(nums);
        }

    }

}
