package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AncestorOfNodesAcyclicGraph {
    public static List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ancestors = new ArrayList<>();
        for(int i =0;i< n;i++){
            ancestors.add(new ArrayList<>());
        }
        for(int i = 0 ; i<edges.length;i++){
            int dest = edges[i][1];
            int src = edges[i][0];
            ancestors.get(dest).add(src);
            for(int j= 0 ; j < ancestors.get(dest).size();j++){
                    ancestors.get(dest).addAll(ancestors.get(ancestors.get(dest).get(j)));
            }
        }
        return ancestors;
    }

    class Solution {
        public List<List<Integer>> getAncestors(int n, int[][] edges) {
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                res.add(new ArrayList<>());
            }

            ArrayList<Integer>[] graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int[] edge : edges) {
                graph[edge[0]].add(edge[1]);
            }

            for (int i = 0; i < n; i++) {
                dfs(graph, i, i, res, new boolean[n]);
            }

            for (int i = 0; i < n; i++) {
                res.get(i).sort(Integer::compareTo);
            }

            return res;
        }

        private void dfs(ArrayList<Integer>[] graph, int parent, int curr, List<List<Integer>> res, boolean[] visit) {
            visit[curr] = true;
            for (int dest : graph[curr]) {
                if (!visit[dest]) {
                    res.get(dest).add(parent);
                    dfs(graph, parent, dest, res, visit);
                }
            }
        }
    }
    public static void main(String[] args) {
        int n =8;
        int [][]edges = {{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}};
        List<List<Integer>> ancestors = getAncestors(n,edges);
        System.out.println(ancestors);
    }
}
