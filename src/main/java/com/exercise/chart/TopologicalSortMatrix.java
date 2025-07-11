package com.exercise.chart;

import java.util.*;
import java.util.stream.Collectors;

public class TopologicalSortMatrix {

    /**拓扑排序
     * 对给定的有向无环图(DAG)进行拓扑排序（邻接矩阵实现）
     * @param adjacencyMatrix 图的邻接矩阵表示，matrix[i][j]=1表示存在从i到j的边
     * @return 拓扑排序后的节点列表，如果图中有环则返回空列表
     */
    public static List<Integer> topologicalSort(int[][] adjacencyMatrix) {
        int n = adjacencyMatrix.length;
        // 存储每个节点的入度
        int[] inDegree = new int[n];
        
        // 计算每个节点的入度
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    inDegree[j]++;
                }
            }
        }
        
        // 创建队列，将所有入度为0的节点加入队列
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        // 存储拓扑排序结果
        List<Integer> result = new ArrayList<>();
        
        // BFS处理队列中的节点
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            result.add(currentNode);
            
            // 减少当前节点的所有邻居的入度
            for (int j = 0; j < n; j++) {
                if (adjacencyMatrix[currentNode][j] == 1) {
                    inDegree[j]--;
                    // 如果邻居的入度变为0，则加入队列
                    if (inDegree[j] == 0) {
                        queue.add(j);
                    }
                }
            }
        }
        
        // 检查是否所有节点都被排序，如果不是则说明图中有环
        if (result.size() == n) {
            return result;
        } else {
            return Collections.emptyList(); // 存在环，返回空列表
        }
    }

    public static void main(String[] args) {
        // 定义一个有向无环图(DAG)的邻接矩阵
        // 节点0-4对应原示例中的节点1-5
        int[][] dagMatrix = {
            {0, 1, 1, 0, 0}, // 节点0(1) -> 节点1(2)和节点2(3)
            {0, 0, 0, 1, 0}, // 节点1(2) -> 节点3(4)
            {0, 0, 0, 1, 0}, // 节点2(3) -> 节点3(4)
            {0, 0, 0, 0, 1}, // 节点3(4) -> 节点4(5)
            {0, 0, 0, 0, 0}  // 节点4(5)没有出边
        };
        
        // 执行拓扑排序
        List<Integer> sortedNodes = topologicalSort(dagMatrix);
        
        // 输出结果
        if (sortedNodes.isEmpty()) {
            System.out.println("图中存在环，无法进行拓扑排序");
        } else {
            System.out.println("拓扑排序结果(节点索引): " + sortedNodes);
            // 转换为原节点编号（+1）
            List<Integer> originalNodes = sortedNodes.stream()
                .map(node -> node + 1).collect(Collectors.toList());
            System.out.println("对应的原始节点编号: " + originalNodes);
        }
    }
}    