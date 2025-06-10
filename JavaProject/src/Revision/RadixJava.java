package Revision;

import java.util.LinkedList;

public class RadixJava {

    public static void main(String[] args) {
        int[] arr = { 321, 805, 729, 10, 573, 243, 24, 7, 3 };
        RadixJava rj = new RadixJava();

        int[] sorted = rj.RadixSort(arr);

        for (int n : sorted) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private int[] RadixSort(int[] nums) {
        int placeValue = 1;
        int biggest = biggestNum(nums);

        for (; (biggest / placeValue) > 0; placeValue *= 10) {
            LinkedList<Integer>[] buckets = new LinkedList[10];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<Integer>();
            }

            for (int number : nums) {
                int value = (number / placeValue) % 10;
                buckets[value].offer(number);
            }

            int current = 0;
            for (int i = 0; i < buckets.length; i++) {
                while (!buckets[i].isEmpty()) {
                    nums[current] = buckets[i].poll();
                    current++;
                }
            }
        }
        return nums;
    }

    private int biggestNum(int[] num) {
        int biggest = num[1];
        for (int number : num) {
            if (number > biggest) {
                biggest = number;
            }
        }

        return biggest;

    }

}
