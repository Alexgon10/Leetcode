package ru.alex.leetcode.easy.graph;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/find-if-path-exists-in-graph/
 */
public class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = graphGenerator(n, edges);
        return pathfinder(source, destination, adj, new boolean[n]);
    }

    public boolean pathfinder(int src, int dest, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        if (src == dest) return true;
        visited[src] = true;
        for (int x : adj.get(src)) {
            if (!visited[x]) {
                boolean hasPathFromX = pathfinder(x, dest, adj, visited);
                if (hasPathFromX) return true;
            }
        }
        return false;
    }

    public ArrayList<ArrayList<Integer>> graphGenerator(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int src = edge[0];
            int dest = edge[1];
            al.get(src).add(dest);
            al.get(dest).add(src);
        }
        return al;
    }
}
