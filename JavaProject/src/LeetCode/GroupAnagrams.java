/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author daniel
 */
public class GroupAnagrams {

    class Solution {

        public List<List<String>> groupAnagrams(String[] strs) {

            List<List<String>> returnThis = new ArrayList<>();
            HashMap<String, List<String>> Grouped = new HashMap<>();

            for (String word : strs) {
                char[] wordToArr = word.toCharArray();
                Arrays.sort(wordToArr);
                String key = new String(wordToArr);

                if (!Grouped.containsKey(key)) {
                    Grouped.put(key, new ArrayList<>());
                }

                Grouped.get(key).add(word);

            }

            returnThis.addAll(Grouped.values());

            return returnThis;

        }
    }

    /*
    Comments I want to make about this question:
    While doing this question, I was trying to keep O(n) in mind.
    Previously, I thought that creating nested loops  would cause 
    O(n^2) to occur however while trying to figure out the question I learnt that 
    this only occurs when the nested loops have an iterator.
    
    This question was quite hard because the return method is a little annoying to wrap your head around
    due to the fact that it wants you to return a List of a List of String Lists
    
    Doing this question, I also learnt more about hashmaps and how keys work for hashmaps
    
    using hashmapname.get(key).add(word) really shows how powerful hashmaps are as we are able to assign
    even whole arrays to a key within a hashmap and really effectively point towards multiple arrays at once.
    
    
    */
}
