package com.exercise.chart;
//课程安排207
class CanFinish1 {
    /**
     * 暴力解法：
     * 1定义一个数组，记录每门课的状态，// 默认开始全部没有学习 0 未学习 1 正在学习 2 已学习
     * 2对每一门课进行遍历学习，并且标记为1，同时对prerequisites第一列元素进行遍历，如果发现与当前课有先修课程，学习该先修课程
     * 3 如果发现有环，直接退出，宣布学习失败
     * 4 最后学习成功，标记为2，遍历isStudy数组，要求全部为2
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 定义一个数组
        int[] isStudy = new int[numCourses];// 默认开始全部没有学习 0 未学习 1 正在学习 2 已学习
        for(int i = 0;i<numCourses;i++){
            // 对每一门课进行学习
            if(isStudy[i]==2){
                continue;
            }
            Dfs(i,isStudy,prerequisites);

        }
        //对isStudy进行判断
        for (int b : isStudy) {
            if (b!=2) {
                return false;
            }
        }
          return  true;

    }

    private void Dfs(int i, int[] isStudy, int[][] prerequisites) {
        isStudy[i]=1;//标记为在学习中
        // 1 判断能不能直接学习
        for(int j =0;j<prerequisites.length;j++){
            if(prerequisites[j][0]==i){
                if(isStudy[prerequisites[j][1]]==0){
                    //有先修课程，先把要修的课程修完
                     Dfs(prerequisites[j][1],isStudy,prerequisites);
                }

                if(isStudy[prerequisites[j][1]]==1){
                    //有环直接退出
                    return;
                }
                if(isStudy[prerequisites[j][1]]==2){
                   continue;
                }

            }
        }
        isStudy[i]=2;


    }
}