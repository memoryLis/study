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
public class L416 {
    boolean sign = false;
    public boolean canPartition(int[] nums) {
        List<Integer> split = new ArrayList<>();
        Set<Integer> colSet = new HashSet();
        reCall(nums,split,colSet);
        return sign;


    }
    void reCall(int[]nums,List<Integer> split, Set<Integer>  colSet){

        for(int i=0;i<nums.length;i++){
            //已经加入了
            if(colSet.contains(i)){
                continue;
            }
            //没有加入到split中
            colSet.add(i);
            split.add(nums[i]);
            //递归终止条件
            if(sumList(split)*2==sum(nums)){
                sign = true;
                return;
            }
            if(sumList(split)>sum(nums)){
               break;
            }else {
                reCall(nums,split,colSet);
            }
            //回溯
            colSet.remove(i);
            split.remove(split.size() - 1); // 移除最后添加的元素
        }

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
    int sumList(List<Integer> array){
        if (array == null || array.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for(Integer temp:array){
            sum=sum+temp;
        }
        return sum;
    }


}
