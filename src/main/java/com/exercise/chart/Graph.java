package com.exercise.chart;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Graph
 * Package: com.exercise.chart
 * Description:
 *
 * @Author liang
 * @Create 2025/6/11 12:24
 * @Version jdk17.0
 */
//无方向图 邻接矩阵
public class Graph {
    LinkedList list ;
    public List<String> vertexList;//顶点
    public int[][] matrix;
    public int edges;
    public boolean[] isVisited;
    public Graph(int n) {
     vertexList = new ArrayList<>(n);
     matrix = new int[n][n];
     edges = 0;
     isVisited = new boolean[n];
     list = new LinkedList();
    }


    //获取第一个邻接点坐标
    public int  getNextVertex(int index) {
            for(int k = 0; k < vertexList.size(); k++) {
                if(matrix[index][k] > 0) {
                    return  k;
                }



        }
        return  -1;
    }
    //根据当前邻接节点来获取下一个邻接节点
    public int  getNextEdge(int i,int j) {
        for (int k=j+1; k < vertexList.size(); k++) {
            if(matrix[i][k] > 0){
                return  k;
            }
        }
        return  -1;

    }
    //加顶点
    public  void  addVertex(String n){
        vertexList.add(n);
    }
    //加边
    public  void  addEdge(int n1, int n2,int weight){
        matrix[n1][n2] = weight;
        matrix[n2][n1] = weight;
        edges++;
    }
    //展示
    public void printGraph(){
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    //深度优先遍历算法
    /*
1)
访问初始结点 v，并标记结点 v 为已访问。
2)
查找结点 v 的第一个邻接结点 w。
3)
若 w 存在，则继续执行 4，如果 w 不存在，则回到第 1 步，将从 v 的下一个结点继续。
4)
若 w 未被访问，对 w 进行深度优先遍历递归（即把 w 当做另一个 v，然后进行步骤 123）。
5)
查找结点 v 的 w 邻接结点的下一个邻接结点，转到步骤 3。
6)
分析图
     */
   //self
    public void dfs(int n){
        if(isVisited[n]){
            return;
        }
        isVisited[n] = true;
        System.out.println(n+"--->"+vertexList.get(n));
        for (int k = 0; k < vertexList.size(); k++) {
            if (matrix[n][k] > 0 && isVisited[k] == false) {
                dfs(k);
            }

        }


    }
    public void Dfs(int n ,boolean[] isVisited){
        if(isVisited[n]){
            return;
        }
        //遍历节点进行打印
        isVisited[n] = true;
        System.out.println(n+"--->"+vertexList.get(n));
        //获取第一个邻接节点
        int w = getNextVertex(n);
        while (w != -1) {
            if(!isVisited[w]){
                Dfs(w,isVisited);
            }
            //被遍历过了
            w = getNextEdge(n, w);
        }


    }

    //考虑到非连通，要遍历每一个节点
    public void DFS(){
        for (int k = 0; k < vertexList.size(); k++) {
            Dfs(k,isVisited);
        }

    }
    //bfs
    public void bfs (int n,boolean[] isVisited){
        if(isVisited[n]){
            return;
        }
        isVisited[n] = true;
        System.out.print("--->"+vertexList.get(n));
        list.addLast(n);
        while (list!=null&&list.size() > 0){
            //只要队列不为空，就取出队列头元素进行遍历
            int  currentNode = (Integer)list.removeFirst();
            for (int k = 0; k < vertexList.size(); k++) {
                 if(matrix[currentNode][k] > 0){
                     //判断该节点是否被访问过
                     if(isVisited[k] == false) {
                         //加入队列，修改标记
                         isVisited[k] = true;
                         System.out.print("--->" + vertexList.get(k));
                         list.addLast(k);
                     }
                 }
            }

        }




    }
    public void bfs(){
        boolean[]isVisited = new boolean[vertexList.size()];
        for (int k = 0; k < vertexList.size(); k++) {
            bfs(k,isVisited);
        }

    }


    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 1);
        graph.addEdge(1, 4, 1);
        graph.printGraph();
        graph.bfs();
    }
    }
