package MoreDSA;

public class ArraySort {
    public void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    // list of 6, 8, 2 gets inputed
    // h = 0, t = 2
    // pivot = list[2]

    // while h(0) < t(2)
    // while t(2) > 0 && list[2] > list[0]
    // fromTail t(2) - 1 fromTail = 1

    private void quickSort(int[] list, int h, int t) {

        if (h < t) {
            int pivot = list[h];
            int fromHead = h;
            int fromTail = t;

            while (fromHead < fromTail) {
                while (fromTail > fromHead && list[fromTail] >= pivot) {
                    fromTail--;
                }

                swap(list, fromHead, fromTail);

                while (fromTail > fromHead && list[fromHead] <= pivot) {
                    fromHead++;
                }

                swap(list, fromHead, fromTail);
            }

            quickSort(list, h, fromHead - 1);
            quickSort(list, fromHead + 1, t);

        }
    }

    private void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 2, 4, 2, 2, 2, 2, 2, 9, 1, 0, 1000, 10 };
        ArraySort sort = new ArraySort();

        sort.quickSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }

}
