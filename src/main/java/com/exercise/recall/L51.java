package com.exercise.recall;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ClassName: L51
 * Package: com.exercise.recall
 * Description:
 *
 * @Author liang
 * @Create 2025/7/18 18:39
 * @Version jdk17.0
 */
public class L51 {
    /**
     * 按照国际象棋的规则，皇后可以攻击与之处在同一行或同一列或同一斜线上的棋子。
     * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
     * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
     * 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
     */
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> board = new ArrayList<>(n);
        //初始化棋盘
        for (int i = 0; i < n; i++) {
             StringBuilder sb = new StringBuilder();
             for (int j = 0; j < n; j++) {
                   sb.append(".");
             }
             board.add(sb.toString());
        }
        Set <Integer> colSet = new HashSet<>(n);
        Set<Integer> addSet = new HashSet<>(n);
        Set<Integer> subSet = new HashSet<>(n);

      reCall(result,board,colSet,addSet,subSet,n,0);
      return result;

    }

    private void reCall(List<List<String>> result, List<String> board, Set<Integer> colSet, Set<Integer> addSet, Set<Integer> subSet, int n, int row) {
        if(n==row){
            //已经走到最后一列，完成n皇后分配问题
            result.add(new ArrayList<>(board));
            return;
        }
        for (int i = 0; i < n; i++) {
            if(colSet.contains(i)||addSet.contains(i)||subSet.contains(i)){
                //不符合对角线，竖线
                continue;
            }
            //符合情况
            colSet.add(i);
            addSet.add(i+row);
            subSet.add(i-row);
            //改变棋局
            char[] charArray = board.get(row).toCharArray();
            charArray[i] =  'Q';
            board.set(row, new String(charArray));
            reCall(result,board,colSet,addSet,subSet,n,row+1);//该行已经判断完毕，进行下一行
            //走到这里，进行回溯

            colSet.remove(i);
            addSet.remove(i+row);
            subSet.remove(i-row);
             charArray = board.get(row).toCharArray();
             charArray[i] =  '.';
            board.set(row, new String(charArray));


        }

    }


}
