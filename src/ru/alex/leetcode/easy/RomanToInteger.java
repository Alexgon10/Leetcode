package ru.alex.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        HashMap<Character, List<Character>> rule = new HashMap<>();
        rule.put('I', Arrays.asList('V', 'X'));
        rule.put('X', Arrays.asList('L', 'C'));
        rule.put('C', Arrays.asList('D', 'M'));

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i != s.length() - 1
                    && rule.containsKey(c)
                    && rule.get(c).contains(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i + 1)) - map.get(c);
                i++;
            } else sum += map.get(c);
        }
        return sum;
    }

    public int romanToInt2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        {
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == 0 || (map.get(s.charAt(i)) <= map.get(s.charAt(i - 1)))) {
                result += map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i)) - map.get(s.charAt(i - 1));
                i--;
            }
        }
        return result;
    }
}
