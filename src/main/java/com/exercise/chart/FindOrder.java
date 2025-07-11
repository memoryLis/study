package com.exercise.chart;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName: FindOrder
 * Package: com.exercise.chart
 * Description:
 *
 * @Author liang
 * @Create 2025/6/24 17:39
 * @Version jdk17.0
 * 210
 */
public class FindOrder {
    /**
     1 拓扑排序
     2 找出入度为0的元素 入队列
     3 进行删除，减少相关节点入度
     4 再次检查入度，如果有为0 入队列 */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int [] idegree = new int[numCourses];//入度
        boolean[] visited = new boolean[numCourses];
        //计算入度
        for(int i=0;i<prerequisites.length;i++){
            idegree[prerequisites[i][0]]++;
        }
        //把入度为0的全加入队列中
        Queue<Integer> queue = new LinkedList<>();
        for(int j=0;j<numCourses;j++){
            if(idegree[j]==0){
                queue.add(j);
                visited[j] = true;
            }

        }
        //拓扑排序结果
        List<Integer> result = new ArrayList();
        //进行广度优先遍历
        while(!queue.isEmpty()){
            int currentNode =  queue.poll();
            result.add(currentNode);
            //减少没有当前节点的入度
            decrease(currentNode,idegree,prerequisites);
            //重新计算，把入度为零加入队列中
            for(int j=0;j<numCourses;j++){
                if(idegree[j]==0&&visited[j]==false){
                    queue.add(j);//可能会重复加入
                    visited[j] = true;
                }
            }

        }
        //判断result
        if(result.size()==numCourses){
            int []data = new int[numCourses];
            for(int i=0;i<numCourses;i++){
                data[i] = result.get(i);
            }
            return data;
        }
        return null;
    }

    private void decrease(int currentNode, int[] idegree, int[][] prerequisites) {
        for(int i =0;i<prerequisites.length;i++){
            if(prerequisites[i][1]==currentNode){
                int index = prerequisites[i][0];
                idegree[index]--;
            }
        }


    }



}
