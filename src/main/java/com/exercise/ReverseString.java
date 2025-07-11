package com.exercise;

/**
 * ClassName: ReverseString
 * Package: com.guang.exercise
 * Description:
 *
 * @Author liang
 * @Create 2025/5/18 16:31
 *  leetcode 344  字符串反转
 */
public class ReverseString {
    public static void reverseString(char[] s) {
        //先计算字符数组长度
        int i = 0;
        for (char temp : s){
            i++;
        }
            char temp;
            for(int j = 0;j<i/2;j++){
               temp= s[i-j-1];
                s[i-j-1]=s[j];
                s[j]=temp;
            }
    }

    public static void main(String[] args) {
        String a ="liang";
        char[] charArray = a.toCharArray();
        System.out.println(charArray);
        reverseString(charArray);
        System.out.println(charArray);


    }

}
