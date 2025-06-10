package Revision;

import Revision.Queue;

public class RadixSortCreation {

    public static void main(String[] args) {
        RadixSortCreation rsc = new RadixSortCreation();
        int[] nums = { 170, 45, 75, 90, 24, 2, 66 };
        int[] sorted = rsc.RadixSort(nums);

        for (int number : sorted) {
            System.out.println(number);
        }

    }

    private int[] RadixSort(int[] nums) {
        int placeValue = 1;
        int maxNum = findBiggest(nums);

        for (; maxNum / placeValue > 0; placeValue *= 10) {
            Queue<Integer>[] buckets = new Queue[10];

            for (int i = 0; i < 10; i++) {
                buckets[i] = new Queue<>();
            }

            for (int i = 0; i < nums.length; i++) {
                int value = ((nums[i] / placeValue) % 10);
                buckets[value].enqueue(nums[i]);
            }

            int counter = 0;

            for (int i = 0; i < buckets.length; i++) {
                Queue<Integer> current = buckets[i];
                while (!current.isEmpty()) {
                    nums[counter] = current.dequeue();
                    counter++;
                }

            }

        }
        return nums;
    }

    public int findBiggest(int[] nums) {
        int biggest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (biggest < nums[i]) {
                biggest = nums[i];
            }
        }

        return biggest;
    }
}
