package ru.alex.others;

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;

import static java.lang.Integer.parseInt;

public class PhotoFeed {
    static List<Integer> heights = new ArrayList<>();
    static String[] array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            heights.add(convertHeight(scanner.nextLine(), w));
        }

        Collections.sort(heights);

        long min = 0;
        long max = 0;

        for (int i = 0; i < k; i++) {
            min += heights.get(i);
            max += heights.get(heights.size() - 1 - i);
        }

        System.out.println(min + "\n" + max);

    }

    private static Integer convertHeight(String size, int w2) {
        array = size.split("x");
        return (int) Math.ceil(parseInt(array[1]) * w2 / (double) parseInt(array[0]));
    }


}
//2000
//5 3
//1000x1000
//1000x1500
//640x930
//640x1500
//3000x1000

//1000
//5 5
//1404x1386
//1132x1110
//1061x1801
//1022x1519
//1529x1003