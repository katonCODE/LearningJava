package MoreDSA;

public class sameLetterChecker {

    public static boolean wordsTest(String w1, String w2) {

        int[] w1count = new int[128];
        int[] w2count = new int[128];

        for (char c : w1.toCharArray()) {
            w1count[c]++;
        }

        for (char c : w2.toCharArray()) {
            w2count[c]++;
        }

        for (int i = 0; i < 128; i++) {
            if (w1count[i] != w2count[i]) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println("\n\nwords test\n");
        System.out.println("study, dusty \t\t" + wordsTest("study", "dusty"));
        System.out.println("university, dusty \t" + wordsTest("university", "dusty"));
        System.out.println("looped, poodle \t\t" + wordsTest("looped", "poodle"));
        System.out.println("teacher, cheater \t" + wordsTest("teacher", "cheater"));
        System.out.println("table, order \t\t" + wordsTest("table", "order"));
        System.out.println("sell, eels \t\t" + wordsTest("sell", "eels"));
        System.out.println("letter, teller \t\t" + wordsTest("letter", "teller"));
        System.out.println("firstsecond, first \t" + wordsTest("firstsecond", "first"));
        System.out.println("esac, case \t\t" + wordsTest("esac", "case"));
        System.out.println("string, substring \t" + wordsTest("string", "substring"));

    }

}
