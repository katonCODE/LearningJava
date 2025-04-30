package MoreDSA;

//did the quicksort problem in DSA class but didn't understand it too well so im doing it again 
//but this time making it myself
public class LearningQuickSort {

    // 1. PUBLIC SORT METHOD (The Entry Point)
    // - This is the method the user will call.
    // - It takes the array to be sorted as input.
    // - Responsibility: Handle initial checks (like null or empty array)
    // and make the first call to the recursive helper method,
    // providing the full array bounds (index 0 to length - 1).

    public void quickSort(int[] list) {
        if (list.length == 0) {
            return;
        } else {

            quickSort(list, 0, list.length - 1);
        }

    }

    private void quickSort(int[] list, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(list, low, high);

        if (low < pivotIndex - 1) {
            quickSort(list, low, pivotIndex - 1);

        }

        if (pivotIndex < high) {
            quickSort(list, pivotIndex, high);
        }

    }

    // 2. RECURSIVE HELPER METHOD (The Core Logic)
    // - Usually private, as it's an internal implementation detail.
    // - Takes the array, a 'low' index, and a 'high' index as input.
    // These define the current sub-array being worked on.
    // - Responsibility:
    // a. Check for the BASE CASE: If low >= high, the sub-array has 0 or 1
    // elements, so it's already sorted. Return immediately.
    // b. If not the base case:
    // i. Call the PARTITION method for the current sub-array (low to high).
    // This method will rearrange the elements and return the final
    // index of the pivot element. Let's call this `pivotIndex`.
    // ii. Recursively call THIS SAME HELPER METHOD for the LEFT sub-array:
    // - Use the bounds: `low` to `pivotIndex - 1`.
    // iii. Recursively call THIS SAME HELPER METHOD for the RIGHT sub-array:
    // - Use the bounds: `pivotIndex + 1` to `high`.

    private int partition(int[] list, int low, int high) {
        int pivot = list[(high + low) / 2];
        int leftPtr = low;
        int rightPtr = high;

        while (leftPtr <= rightPtr) {
            while (list[leftPtr] < pivot) {
                leftPtr++;
            }

            while (list[rightPtr] > pivot) {
                rightPtr--;
            }

            if (leftPtr <= rightPtr) {
                swap(list, leftPtr, rightPtr);
                leftPtr++;
                rightPtr--;
            }

        }

        return leftPtr;
    }
    // 3. PARTITION METHOD (The Workhorse)
    // - Usually private.
    // - Takes the array, 'low' index, and 'high' index as input.
    // - Responsibility:
    // a. Choose a PIVOT element (e.g., middle, last, first). Store its *value*.
    // b. Initialize two pointers/indices (e.g., `leftPtr` starting at `low`,
    // `rightPtr` starting at `high`).
    // c. Loop until the pointers cross (`leftPtr > rightPtr`):
    // i. Move `leftPtr` rightwards until you find an element >= pivot value.
    // ii. Move `rightPtr` leftwards until you find an element <= pivot value.
    // iii. If `leftPtr` is still <= `rightPtr`:
    // - SWAP the elements at `leftPtr` and `rightPtr`.
    // - Advance `leftPtr` (increment).
    // - Advance `rightPtr` (decrement).
    // d. Return the index that marks the partition boundary. (This is often
    // `leftPtr` after the loop terminates in the Hoare scheme, but double-check
    // the specific logic you implement). This returned index will be used
    // by the recursive helper.

    private void swap(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;

        return;
    }

    // 4. SWAP METHOD (Utility)
    // - Usually private.
    // - Takes the array and two indices (`index1`, `index2`) as input.
    // - Responsibility: Swap the values at the given indices in the array using a
    // temporary variable.
    // - Returns: void (it modifies the array directly).

    // (Optional) Main method for testing
    // - Create a sample array.
    // - Create an instance of your QuickSort class.
    // - Call the public sort method.
    // - Print the array before and after sorting to verify.

    public static void main(String[] args) {
        LearningQuickSort q = new LearningQuickSort();
        int arr[] = { 6, 2, 3, 2, 99, 100, 23 };

        q.quickSort(arr);

        for (int nums : arr) {
            System.out.println(nums);
        }

    }

}
