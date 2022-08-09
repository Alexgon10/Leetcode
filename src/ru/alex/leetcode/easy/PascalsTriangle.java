package ru.alex.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalsTriangle {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {
        result.add(0, List.of(1));
        for (int i = 1; i < numRows; i++) {
            result.add(i, new ArrayList<>(i));
            for (int j = 0; j <= i; j++) {
                count(i, j);
            }
        }
        return result;
    }

    private void count(int row, int column) {
        int value = getCacheResult(row - 1, column - 1) + getCacheResult(row - 1, column);
        result.get(row).add(column, value);
    }

    private int getCacheResult(int row, int column) {
        if (column == -1 || column > row) {
            return 0;
        }
        return result.get(row).get(column);
    }
}
