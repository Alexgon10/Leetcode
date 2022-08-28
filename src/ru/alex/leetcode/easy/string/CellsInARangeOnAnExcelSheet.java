package ru.alex.leetcode.easy.string;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {

    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        for (int i = (int)s.charAt(1); i < (int)s.charAt(4); i++) {
            result.add(String.valueOf(s.charAt(0)).concat(Integer.toString(i)));
            for (int j = (int) s.charAt(0); j< (int) s.charAt(4); j++){
                result.add(String.valueOf((char) j).concat(Integer.toString(i)));
            }
        }
        return result;
    }
}
