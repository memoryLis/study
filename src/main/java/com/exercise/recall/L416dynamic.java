package com.exercise.recall;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ClassName: L416
 * Package: com.exercise.recall
 * Description:
 *
 * @Author liang
 * @Create 2025/7/18 20:11
 * @Version jdk17.0
 */
public class L416dynamic {
    /**
     * 使用动态规划进行解题
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        int sum = sum(nums);
        int target = sum/2;
        if(sum%2 != 0){
            return false;
        }
        //dp数组第i位表示，当前i这个数字是不是其子集得和，是的话为true
        boolean dp[] = new boolean[target+1];
        dp[0] = true;
        int breakSing = 0;
        for (int num : nums) {
            if(breakSing == 1){
                break;
            }
            //对每种情况进行相加
            boolean[] dpTem = dp.clone();
            for(int i = 0; i <= target; i++) {
                if(dpTem[i]&&(i+num <= target)) {
                    dp[i+num] = true;
                }
                if(dp[target]){
                    breakSing =1;
                    break;
                }
            }
        }



        if(dp[target]){
            return true;
        }
        return false;



    }


    int sum(int[] array){
        if (array == null || array.length == 0) {
            return 0; // 空数组返回0（或根据需求抛异常）
        }
        int sum = 0;
        for(int temp:array){
            sum=sum+temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        L416dynamic l416dynamic = new L416dynamic();
        System.out.println(l416dynamic.canPartition(new int[]{1,2,5}));
    }


}
