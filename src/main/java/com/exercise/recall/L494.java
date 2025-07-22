package com.exercise.recall;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: L494
 * Package: com.exercise.recall
 * Description:
 *
 * @Author liang
 * @Create 2025/7/20 11:17
 * @Version jdk17.0
 */
public class L494 {
    /**
     * 暴力回溯
     */
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {

        /**
         使用回溯 */
        int sum = 0;
        reCall(0,nums,target,sum);
        return count;
    }
    void reCall(int col,int[] nums,int target,int sum){
        if(col == nums.length && sum ==target){
            count++;
            return ;
        }
        if(col>=nums.length){
            return;
        }
        for(int i = 1;i<=2 ;i++){
            if(i==1){
                sum = sum + nums[col];
                reCall(col+1,nums,target,sum);
                //回溯
                sum = sum -nums[col];
            }else{
                sum = sum - nums[col];
                reCall(col+1,nums,target,sum);
                //回溯
                sum = sum +nums[col];

            }
        }


    }
}
