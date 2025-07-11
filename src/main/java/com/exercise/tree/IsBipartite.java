package com.exercise.tree;

import com.exercise.chart.Graph;

import java.util.*;

/**
 * ClassName: IsBipartite
 * Package: com.exercise.tree
 * Description:
 *
 * @Author liang
 * @Create 2025/6/24 13:06
 * @Version jdk17.0
 */
public class IsBipartite {
    public boolean isBipartite(int[][] graph) {
        List<Integer> first = new ArrayList();
        List<Integer> second = new ArrayList();
        boolean isVisited[] = new boolean[graph.length];
        // 开始遍历，使用广度优先遍历
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < graph.length; i++) {
            if(isVisited[i]) {
                continue;
            }
            isVisited[i] = true;
            first.add(i);
            queue.add(i);
            // 找到其所有相关边
            while (!queue.isEmpty()) {
                int node = queue.poll();
                // 判断在二分图中哪一个集合
                if (first.contains(node)) {
                    for (int j = 0; j < graph[node].length; j++) {
                        if(first.contains(graph[node][j])) {
                            return false;
                        }
                        // 判断其是否与同一条边上的节点在同一个子集中
                        if (!second.contains(node) && !second.contains(graph[node][j])) {
                            //加入前判断是否和其中节点有边
                       boolean side= isSide(graph[node][j],second,graph);
                       if(side){
                           second.add(graph[node][j]);
                           queue.add(graph[node][j]);
                           isVisited[graph[node][j]] = true;
                       }else {
                           return false;
                       }
                        }
                    }
                } else if (second.contains(node)) {
                    for (int j = 0; j < graph[node].length; j++) {
                        if (second.contains(graph[node][j])) {
                            return false;
                        }
                        // 判断其是否与同一条边上的节点在同一个子集中
                        if (!first.contains(node) && !first.contains(graph[node][j])) {
                            boolean side= isSide(graph[node][j],first,graph);
                            if(side){
                                first.add(graph[node][j]);
                                queue.add(graph[node][j]);
                                isVisited[graph[node][j]] = true;
                            }else {
                                return false;
                            }
                        }

                    }

                }
            }

        }
        return true;

    }

    private boolean isSide(int node, List<Integer> second, int[][] graph) {
        for (Integer i : second) {
            int[] temp =graph[i];
            for (int i1 : temp) {
                if(node==i1) {
                    return false;
                }

            }
        }

        return  true;
    }

    public static void main(String [] args){
        int[][] a = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        IsBipartite isBipartite = new IsBipartite();
        boolean bipartite = isBipartite.isBipartite(a);

    }


}
