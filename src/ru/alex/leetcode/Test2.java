package ru.alex.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test2 {
    static List<String> heights = new ArrayList<>();
    static String[] array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            heights.add(scanner.nextLine());
        }
        List<Integer> nums = heights.stream().map((s)-> {
            array = s.split("x");
            return (int)Math.ceil(Integer.parseInt(array[1]) * w / (double)Integer.parseInt(array[0]));
        }).sorted().collect(Collectors.toList());

        int min = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            min += nums.get(i);
            max += nums.get(heights.size() - 1 - i);
        }
        System.out.println(min + "\n" + max);
    }
}
