package ru.alex.others;

import java.util.Locale;

public class IsValidPalindrome {
    public boolean isPalindromeMixed(String s){
        int[] counter = new int[128];
        s = s.toLowerCase(Locale.ROOT);
        for(char c: s.toCharArray()){
            if (c >='a' && c<='z' || c>='A' && c<='Z'){
                System.out.println((char) c);
                counter[c]++;
            }
        }
        boolean isPresentUnpaired = false;
        for(int i: counter){
            if(i % 2 == 0){
                continue;
            }
            if(isPresentUnpaired) {
                return false;
            } else isPresentUnpaired=true;
        }
        return true;
    }

    public static void main(String[] args) {
        IsValidPalindrome isValidPalindrome = new IsValidPalindrome();
        System.out.println(isValidPalindrome.isPalindromeMixed("Tact coa"));
        System.out.println(isValidPalindrome.isPalindromeMixed("Tact coaa"));
    }
}
