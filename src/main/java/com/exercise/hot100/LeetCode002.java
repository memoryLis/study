package com.exercise.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: Test
 * Package: com.exercise
 * Description:
 *
 * @Author liang
 * @Create 2025/9/24 22:51
 * @Version jdk17.0
 */
public class LeetCode002 {
        public List<List<String>> groupAnagrams(String[] strs) {
            return new ArrayList<>(Arrays.stream(strs)
                    .collect(Collectors.groupingBy(str -> {
                        // 返回 str 排序后的结果。
                        // 按排序后的结果来grouping by，算子类似于 sql 里的 group by。
                        char[] array = str.toCharArray();
                        Arrays.sort(array);
                        return new String(array);
                    })).values());
        }

}
