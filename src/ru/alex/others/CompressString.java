package ru.alex.others;


/**
 * Реализуйте метод для выполнения простейшего сжатия строк с использованием счетчика повторяющизся символов( aaabbcddaa - > a3b2c1d2a2)
 */
public class CompressString {
    public String compress(String s) {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        char current = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == current) {
                counter++;
            } else {
                result.append(current).append(counter);
                counter = 1;
                current = s.charAt(i);
            }
        }
        return result.length() >= s.length() ? s : result.toString();
    }

    public static void main(String[] args) {
        CompressString compressString = new CompressString();
        System.out.println(compressString.compress("aaabbcddaaa"));
    }
}
