package com.exercise.chart;

/**
 * ClassName: Solve
 * Package: com.exercise.chart
 * Description:
 *
 * @Author liang
 * @Create 2025/6/12 19:08
 * @Version jdk17.0
 */
public class Solve {
    int sign = 0;

    public void solve(char[][] board) {
        //1 创建boolean数组
        //2 把可以被围绕的区域的全标记为为true
        boolean[][] isVisited = new boolean[board.length][board[0].length];//默认全部为flase
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'O'&&isVisited[i][j]== false) {
                    boolean[][] isTemp = new boolean[isVisited.length][isVisited[0].length];
                    for (int a = 0; a < isVisited.length; a++) {
                        for (int b = 0; b < isVisited[a].length; b++) {
                            isTemp[a][b] = isVisited[a][b];
                        }
                    }
                    isTemp= Dfs(i,j,board,isTemp);
                    if(sign==1){
                        //表面它在 board 的边缘并且不能被围绕。
                        sign=0;
                    }else if(sign==0){
                        //表明可以被围绕
                        isVisited =isTemp;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'O'&&isVisited[i][j]== true) {
                    board[i][j]='X';
                }
            }
        }


    }

    private boolean[][] Dfs(int i, int j, char[][] board, boolean[][] isVisited) {
        isVisited[i][j]=true;
        //遍历该单元个上下左右
        int [][] temp = {{1,0},{0,1},{0,-1},{-1,0}};
        for (int k = 0; k < temp.length; k++) {
            int x = i+ temp[k][0];
            int y = j +temp[k][1];//得到当前单元格的上下坐标
            if(x>board.length-1||y>board[0].length-1||x<0||y<0){
                //违规了，把当前区域标记全部取消
                sign=1;
                break;
            }
            if(board[x][y]=='O'&&isVisited[x][y]==false){
                Dfs(x,y,board,isVisited);
            }

        }
        return isVisited;

    }
}
