package LeetCode;

/*
 * This was actually done twice, I did it first with a stack and it worked but it took longer because it
 * required the whole char array to be added to a stack which adds a longer run time of n (length of charArr)
 * This two pointer method I changed to is much quicker
 */
public class ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {

            StringBuilder sb = new StringBuilder();
            for (char c : s.toLowerCase().toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    sb.append(c);
                }

            }

            String cleaned = sb.toString();
            char[] arr = cleaned.toCharArray();

            int i = 0;
            int j = (cleaned.length() - 1);

            for (; i < cleaned.length(); i++, j--) {
                if (arr[i] != arr[j]) {
                    return false;
                }
            }

            return true;

        }

    }

}
