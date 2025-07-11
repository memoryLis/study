package com.exercise.chart;

/**
 * ClassName: Solve
 * Package: com.exercise.chart
 * Description:
 *
 * @Author liang
 * @Create 2025/6/12 19:08
 * @Version jdk17.0
 *
 * 优化 130 被围绕的区域
 */
public class Solve2 {
    /**
     * 1从边界开始，遍历边界的元素
     * 2 如果是‘O',进行dfs，这个区域进行标记
     * 3 遍历board,没进行标记的全改为'X'
     * @param board
     */

    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] isVisited = new boolean[board.length][board[0].length];
        //从边界开始遍历  左右边界
        for (int k = 0; k < board.length; k++) {
              if(board[k][0]=='O'&&isVisited[k][0]==false){
                  Dfs(k,0,board,isVisited);
              }
              if(board[k][col-1]=='O'&&isVisited[k][col-1]==false){
                  Dfs(k,col-1,board,isVisited);
              }
        }
        //上下边界
        for (int k = 0; k < col; k++) {
            if(board[0][k]=='O'&&isVisited[0][k]==false){
                Dfs(0,k,board,isVisited);
            }
            if(board[row-1][k]=='O'&&isVisited[row-1][k]==false){
                Dfs(row-1,k,board,isVisited);
            }

        }
        for (int k = 0; k < row; k++) {
            for (int l = 0; l < col; l++) {
                if(isVisited[k][l]==false){
                    board[k][l]='X';
                }
            }
        }






    }

    private void Dfs(int i, int j, char[][] board, boolean[][] isVisited) {
        isVisited[i][j]=true;
        //遍历该单元个上下左右
        int [][] temp = {{1,0},{0,1},{0,-1},{-1,0}};
        for (int k = 0; k < temp.length; k++) {
            int x = i+ temp[k][0];
            int y = j +temp[k][1];//得到当前单元格的上下坐标
            if(x>board.length-1||y>board[0].length-1||x<0||y<0){
                continue;
            }
            if(isVisited[x][y]==false&& board[x][y]=='O'){
                isVisited[x][y]=true;
                Dfs(x,y,board,isVisited);
            }


        }


    }
}
