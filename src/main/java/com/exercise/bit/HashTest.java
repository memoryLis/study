package com.exercise.bit;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: HashTest
 * Package: com.exercise.bit
 * Description:
 *
 * @Author liang
 * @Create 2025/7/20 16:14
 * @Version jdk17.0
 */
public class HashTest {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(1,2);
        System.out.println(map.get(1));
    }
}
