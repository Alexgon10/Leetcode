package ru.alex.others;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Для двух строк напишите метод определяющий является ли одна строка перестановкой другой
 */
public class IsStringMixed {
    public boolean isStringMixed(String s1, String s2) {

        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set  = new HashSet<>();

        if (s1.length() != s2.length()) {
            return false;
        }
        int[] counter = new int[128];
        for (char c : s1.toCharArray()) {
            counter[c] = counter[c] + 1;
        }
        for (char c : s2.toCharArray()) {
            counter[c] = counter[c] - 1;
        }
        for (int i : counter) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsStringMixed isStringMixed = new IsStringMixed();
        System.out.println(isStringMixed.isStringMixed("aabbssc", "cassabb"));
        System.out.println(isStringMixed.isStringMixed("aabbssc", "cassab"));
        System.out.println(isStringMixed.isStringMixed("aabbssc", "cassabbb"));

        System.out.println(isStringMixed.permutation("aabbssc", "cassabb"));
        System.out.println(isStringMixed.permutation("aabbssc", "cassab"));
        System.out.println(isStringMixed.permutation("aaa", "vvv"));

    }

    boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letters = new int[128]; // Предположение 7
        char[] s_array = s.toCharArray();
        for (char c : s_array) { // Подсчет вхождений каждого символа в s.
            letters[c]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

}
