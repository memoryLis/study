package com.exercise.recall;

/**
 * ClassName: L494Dynamic
 * Package: com.exercise.recall
 * Description:
 *
 * @Author liang
 * @Create 2025/7/20 14:12
 * @Version jdk17.0
 */
public class L494Dynamic {
    public int findTargetSumWays(int[] nums, int target) {
        /**
         动态规划
         1 定义两个集合，一个集合为前面符合为+ ，一个为- ，记为 add和，sub
         sum(add)+sum(sub) = sum,sum(add)-sum(sub) = target 这里sub取的是绝对值
         我们的到 sum(add) = (sum+target)/2;
         2 因此，我们把目标转换为 求一个子集和，和为 p = （sum + target）/2
         3 因此用动态规划解决，dp[i]  dp数组含义是和为i的子集数目
         4 每次加入一个nums 中元素num，然后改变dp[i]  dp[i] = d[i-num];
         5 最后返回dp[p];
         */
        int sum  =   sumInt(nums);
        int p = (target+sum)/2;  //p为，nums子集中，和为p的子集

        if((target+sum)%2 == 1 || sum< target || target<-sum){
            return 0;
        }
        int dp[] = new int[p+1]; //dp数组含义是和为p的子集数目
        dp[0] = 1;
        //将nums数组中元素依次加入
        for(int num:nums){
            for(int i = p; i>=num;i--){
                dp[i] += dp[i-num];
            }
        }
        return dp[p];


    }


    int sumInt(int [] nums){
        if(nums!=null && nums.length!=0){
            int sum = 0;
            for(int num : nums){
                sum  = sum + num;
            }
            return sum;

        }
        return 0;
    }
}
