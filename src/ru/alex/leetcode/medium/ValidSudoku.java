package ru.alex.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> rowMap = new HashMap<>();
        Map<Integer, Set<Integer>> columnMap = new HashMap<>();
        Map<Integer, Set<Integer>> boxMap = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (Character.isDigit(c)) {
                    Integer value = convertToInt(c);
                    if (isInvalidOrPut(rowMap, i, value) ||
                            isInvalidOrPut(columnMap, j, value) ||
                            isInvalidOrPut(boxMap, (i / 3) * 3 + (j / 3), value)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    private boolean isInvalidOrPut(Map<Integer, Set<Integer>> map, Integer key, Integer value) {
        Set<Integer> set = map.get(key) == null ? new HashSet<>() : map.get(key);
        if (set.contains(value)) {
            return true;
        } else {
            set.add(value);
            map.put(key, set);
            return false;
        }
    }

    private Integer convertToInt(char c) {
        return Integer.valueOf(Character.toString(c));
    }
}
