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
}
