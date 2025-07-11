package com.exercise.greedy;

/**
 * ClassName: L452
 * Package: com.exercise.greedy
 * Description:
 *
 * @Author liang
 * @Create 2025/7/6 19:12
 * @Version jdk17.0
 */

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 452. 用最少数量的箭引爆气球
 */
public class L452 {
    /**
     1对气球数组进行排序，根据气球的Xend
     2 遍历每一个气球，选择其Xend作为x轴坐标进行打爆，同时对打爆的气球进行标记
     3 在上述过程中，用当前Xend进行打爆时，是贪心算法，判断能不能打爆更多气球，打打爆的进行标记 */
    public int findMinArrowShots(int[][] points) {
        //排序，更改xend大小
        // 使用内置排序并处理溢出问题
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int sign[] = new int[points.length];
        int sum = 0;
        int stop = 0;
        //已经排序号按points[i][1];
        for(int a = 0;a<points.length;a++){
            if(stop == 1){
                break;
            }
            if(sign[a]==0){
                sign[a]=1;
                sum++;
                for(int b=a+1;b<points.length;b++){
                    if(sign[b]==0&&points[a][1]>=points[b][0]&&points[a][1]<=points[b][1]){
                        sign[b]=1;
                        if(b==points.length){
                            stop =1;
                        }
                    }

                }
            }

        }
        return sum;

    }

    public static void main(String[] args) {
        int sign[] = new int[5];

    }
}
