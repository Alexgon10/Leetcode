package ru.alex.leetcode.easy.string;

/**
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 */
public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int counter=0;
        for(String s : operations){
            if("++X".equals(s) || "X++".equals(s)) {
                counter++;
            }else counter--;
        }
        return counter;
    }
}
