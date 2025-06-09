package Revision;

public class Week2Q3 {
    public static void main(String[] args) {
        String s = BinaryMethod(13, "");

        System.out.println(s);

    }

    public static String BinaryMethod(int n, String s) {

        if (n == 0) {
            return s;
        }
        s = (n & 1) + s;
        return BinaryMethod(n / 2, s);

    }
}
