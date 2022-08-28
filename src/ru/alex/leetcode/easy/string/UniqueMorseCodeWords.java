package ru.alex.leetcode.easy.string;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-morse-code-words/
 */
public class UniqueMorseCodeWords {
    String [] codes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> result = new HashSet<>();
        for(String w : words){
            String morse = "";
            for (Character c : w.toCharArray()){
                morse = morse.concat(codes[c-'a']);
            }
            result.add(morse);
        }
        return result.size();
    }

}
