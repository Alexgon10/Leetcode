package ru.alex.leetcode.easy.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < edges.length; i++){
            for(int j=0; j<edges[i].length; j++){
                if(list.contains(edges[i][j])){
                    return edges[i][j];
                }else list.add(edges[i][j]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Stack<Integer>> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        list.add(stack);
        System.out.println(list);
        stack.pop();
        System.out.println(list);
    }
}
