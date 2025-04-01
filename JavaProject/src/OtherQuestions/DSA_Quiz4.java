package OtherQuestions;

import java.util.Scanner;

public class DSA_Quiz4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            System.out.println(palindromeEvaluator(input));

        }

    }

    //takes the first half of the string, puts it in a stack then compares the second half to the values in the stack
    //which should be the reverse of the first half of values

    public static boolean palindromeEvaluator(String input) {

        int inputLength = input.length();

        char[] normal = input.toLowerCase().toCharArray();

        Stack<Character> reverse = new Stack<>();

        int middle = inputLength % 2 == 0 ? inputLength / 2 : (inputLength / 2) + 1;

        for (int i = 0; i < (middle - 1); i++) {
            reverse.push(normal[i]);
        }


        for (int i = middle; i < inputLength; i++) {


            if (reverse.isEmpty() || reverse.pop() != normal[i]) {
                
                return false;
            }
        }

        return true;

    }

}
