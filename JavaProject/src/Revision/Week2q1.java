package Revision;

public class Week2q1 {
    public static void main(String[] args) {
        diamond(6, 6);
    }

    public static void repeatlyPrint(int amount, String pattern) {
        if (amount > 0) {
            // print a pattern once
            System.out.print(pattern);
            // recursively call the function itself
            repeatlyPrint(amount - 1, pattern);
        }
    }

    public static void diamond(int topHeight, int currentRow) {
        repeatlyPrint(currentRow, " ");
        ; // print spaces (outside of diamond)
        repeatlyPrint(topHeight - currentRow, "* ");// print asterisks and spaces
        System.out.println();

        if (currentRow > 0) {
            diamond(topHeight, currentRow - 1);
        }

        repeatlyPrint(currentRow + 1, " ");// print spaces
        repeatlyPrint(topHeight - currentRow, "* ");// print asterisks and spaces
        System.out.println();
    }

}
