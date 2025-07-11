package com.exercise.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

class LengthOfLIS {
    /**
    创建一个dp数组，dp[i]的含义是，以nums[i]结尾最长递增子序列的值
    dp[i+1] 的值这样获取：遍历nums[0] 到nums[i] ，如果nums[i+1]大于其中一个，记录临时dp tempDp[i+1]
    把这个临时dp记录到一个集合中，取集合中的最大值为dp[i+1],如果集合为空，最大值为1 */
     public int lengthOfLIS ( int[] nums){
            int dp[] = new int[nums.length];
            for (int i = 0; i < dp.length; i++) {
                dp[i] = 1;
            }
            for (int a = 0; a < nums.length; a++) {
                List<Integer> max = new ArrayList<>();
                for (int b = 0; b < a; b++) {
                    if (nums[a] > nums[b]) {
                        int dptemp = dp[b] + 1;
                        max.add(dptemp);
                    }
                }
                dp[a] = getMax(max);
            }
            // 去dp数组中最大值
            // 去dp数组中最大值
            int maxDp = dp[0];
            for (int a : dp) {
                if (a > maxDp) {
                    maxDp = a;
                }
            }
            return maxDp;


        }


    public Integer getMax (List<Integer> max){
        if(max != null && max.size() > 0){
                Integer maxInt = max.get(0);
                for (Integer temp : max) {
                    if (temp > maxInt) {
                        maxInt = temp;
                    }
                }
                return  maxInt;
            }
            return 1;
    }
}