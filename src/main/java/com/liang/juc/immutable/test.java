package com.liang.juc.immutable;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * ClassName: test
 * Package: com.liang.juc.immutable
 * Description:
 *
 * @Author liang
 * @Create 2025/4/18 16:11
 * @Version jdk11
 */
public class test {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        TemporalAccessor parse = dateTimeFormatter.parse("2025-12-01");
        System.out.println(parse);
        Long l = Long.valueOf(5);
        Long l1 = Long.valueOf(5);
        Long l3 = Long.valueOf(10);
        Long l2 = l+l1;
        System.out.println(l3==l2);
    }
}
