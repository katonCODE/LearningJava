/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject;

/**
 *
 * @author daniel
 */
public class ValidAnagram {

    class Solution {

        public boolean isAnagram(String s, String t) {

            int[] letterFreqInS = new int[26];
            int[] letterFreqInT = new int[26];

            for (char ch : s.toCharArray()) {
                letterFreqInS[ch - 'a']++;
            }

            for (char ch : t.toCharArray()) {
                letterFreqInT[ch - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                if (letterFreqInS[i] != letterFreqInT[i]) {
                    return false;
                }
            }

            return true;

        }
    }

}
