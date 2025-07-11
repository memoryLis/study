package com.exercise.chart;

/**
 * ClassName: NumIslands
 * Package: com.exercise.chart
 * Description:
 *
 * @Author liang
 * @Create 2025/6/11 20:07
 * @Version jdk17.0
 */
// 岛屿数量
public class NumIslands {
    /**
     * 1 对整个二维数组进行遍历，发现有新大陆就记录数量+1
     * 2 同时把大陆周围的大陆进行全部遍历，并且标记已经遍历了
     * 3 返回大陆数量
     */
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //遍历每一个大陆，并且保证该大陆没有被发现过
                if (!visited[i][j] && grid[i][j] == '1') {
                    //进行深搜，把该大陆周围的全部大陆进行标记
                    count++;
                    Dfs(i, j, grid, visited);

                }
            }
        }
        return count;
    }
    public void Dfs(int x,int y ,char[][] grid,boolean[][] visited) {
        //获得该节点上下左右
        int[][] temp={
            {1,0},{-1,0},{0,1},{0,-1}
        };
        //进该节点上下左右进行判断
        for(int i =0;i<4;i++){
           int currentX = x+temp[i][0];
           int currentY = y+temp[i][1];
           //判断上下左右边上是否是越界，或者是否是海洋，如果是就不进行操作
            if(currentY>grid.length -1 ||currentX<0||currentX>grid[0].length -1 ||currentY<0){
                //进行了越界
                continue;

            }
           if(grid[currentX][currentY]=='1'&& visited[currentX][currentY]==false){
               visited[currentX][currentY]=true;
               //在此递归进行遍历
               Dfs(currentX,currentY,grid,visited);

           }
        }

    }

    public static void main(String[] args) {


    }
}
