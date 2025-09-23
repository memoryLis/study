package com.exercise.greedy.exercise.suanfa;

/**
 * ClassName: Bubble
 * Package: com.exercise.suanfa
 * Description:
 *
 * @Author liang
 * @Create 2025/9/16 20:25
 * @Version jdk17.0
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
