package ru.alex.leetcode.easy.string;


import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        List<Character> jewelsList = new ArrayList<>();
        for (Character c : jewels.toCharArray()){
            jewelsList.add(c);
        }
        for (Character c : stones.toCharArray()){
            if (jewelsList.contains(c))
                result++;
        }
        return result;
    }

    /**
     * 2nd way
     */
    public int numJewelsInStones2(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1)
                result++;
        }
        return result;
    }
}
