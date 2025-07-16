package com.exercise.greedy;

import java.util.Arrays;

/**
 * ClassName: L435
 * Package: com.exercise.greedy
 * Description:
 *
 * @Author liang
 * @Create 2025/7/15 20:30
 * @Version jdk17.0
 */
public class L435 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        //排序
        int [] temp ;
        Arrays.sort(intervals,(a,b)->{
            return a[1]-b[1];
        });
        for (int j = 0; j < intervals.length - 1; j++) {
            for (int i = 0; i < intervals.length - 1 - j; i++) {
                if (intervals[i][1] > intervals[i+1][1]) {
                    // 交换
                    temp = intervals[i+1];
                    intervals[i+1] = intervals[i];
                    intervals[i] = temp;
                }
            }
        }
        int removeNums = 0;
        //进行移除
        int lastMax =0;
        for(int j= 0;j<intervals.length;j++){
            if(intervals[j][0]<lastMax){
                removeNums++;//移除当前结点
            }else{
                lastMax = intervals[j][1];
            }

        }
        return removeNums;

    }

    public static void main(String[] args) {

        int[][] array = {
                {1, 100},
                {11, 22},
                {1, 11},
                {2, 12}
        };
        System.out.println(eraseOverlapIntervals(array));

    }
}
