package com.exercise.bit;

/**
 * ClassName: L191
 * Package: com.exercise.bit
 * Description:
 *
 * @Author liang
 * @Create 2025/7/20 14:54
 * @Version jdk17.0
 */
public class L191 {
    public int hammingWeight(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int remainder ;
        while(n!=0){
            remainder = n%2;
            stringBuilder.append(remainder);
            n = n/2;
        }
        char[] charArray = stringBuilder.reverse().toString().toCharArray();
        int count = 0;
        for (char c : charArray) {
            if(c=='1'){
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        L191 l191 = new L191();
        System.out.println(l191.hammingWeight(13));
        char a = 65;
        System.out.println(a);
    }
}
