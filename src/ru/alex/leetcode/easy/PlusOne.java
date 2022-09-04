package ru.alex.leetcode.easy;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    int length;

    public int[] plusOne(int[] digits) {
        length = digits.length;
        return calculate(digits, length - 1);
    }

    private int[] calculate(int[] digits, int index) {
        if (index < 0) {
            int[] result = new int[length + 1];
            result[0] = 1;
            return result;
        }
        int value = digits[index];
        if (value == 9) {
            digits[index] = 0;
            return calculate(digits, index - 1);
        } else {
            digits[index] = value + 1;
            return digits;
        }

    }

    /**
     *  2 way
     * */
    public int[] plusOne2(int[] digits) {
        for (int i=digits.length-1; i>=0; i--){
            if (digits[i] == 9){
                if(i==0){
                    int[] result = new int[digits.length+1];
                    result[0]=1;
                    return result;
                }
                digits[i]=0;
            }else {
                digits[i]=digits[i]+1;
                break;
            }
        }
        return digits;
    }
}
