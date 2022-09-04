package ru.alex.leetcode.easy;

import java.util.*;

/**
 * Нужно сделать очередь в которую можно класть элементы, а при получении элемента возвращается первый уникальный
 * (если добавить 1 1 2 2 3 4) то вернется 3
 * */

public class UniqueQueue {
    private final LinkedList<Integer> list = new LinkedList<>();
    private final HashMap<Integer, Integer> counter = new HashMap<>();


    public static void main(String[] args) {
        UniqueQueue uniqueQueue = new UniqueQueue();
        uniqueQueue.push(1);
        uniqueQueue.push(1);
        uniqueQueue.push(2);
        uniqueQueue.push(2);
        uniqueQueue.push(3);
        uniqueQueue.push(4);
        System.out.println(uniqueQueue.peek());
        System.out.println(uniqueQueue.pop());
        System.out.println(uniqueQueue.peek());
    }


    public Integer peek() {
        for (Integer element : list) {
            if (counter.get(element) == 1) {
                System.out.println(list);
                return element;
            }
        }
        return null;
    }

    public Integer pop() {
        for (Integer element : list) {
            if (counter.get(element) == 1) {
                counter.remove(element);
                list.remove(element);
                System.out.println(list);
                return element;
            }
        }
        System.out.println(list);
        return null;
    }

    public void push(Integer i) {
        list.offer(i);
        System.out.println(list);
        if (counter.containsKey(i)) {
            counter.put(i, counter.get(i) + 1);
        } else counter.put(i, 1);
    }

}
