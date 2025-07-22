package com.exercise.bit;

/**
 * ClassName: L371
 * Package: com.exercise.bit
 * Description:
 *
 * @Author liang
 * @Create 2025/7/20 15:26
 * @Version jdk17.0
 */
public class L371 {


    public static void main(String[] args) {
        int b = 100;
        int a = 23;
        int temp ;
     while (b!= 0){
         temp = (a & b) <<1;
         a = a ^ b;
         b = temp;

     }
        System.out.println(a);

    }


}
