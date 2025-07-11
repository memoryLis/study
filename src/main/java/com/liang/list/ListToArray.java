package com.liang.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: ListToArray
 * Package: com.liang.list
 * Description:
 *
 * @Author liang
 * @Create 2025/4/21 22:02
 * @Version jdk11
 */
public class ListToArray {
    public static void main(String[] args) {
        String[] a = {"liang","huang","liang"};
        List<String> list = Arrays.asList(a);
        float[][] x={{3,2,1.5f},{3,2,1.5f}};
        float[] o = (float[])Array.get(x, 0);
        for (float v : o) {
            System.out.println(v);

        }


    }

    private static void extracted() {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("huang");
        objects.add("laing");
        Object[] array = objects.toArray();
        for (Object o : array) {
            System.out.println(o);
        }
    }
}
