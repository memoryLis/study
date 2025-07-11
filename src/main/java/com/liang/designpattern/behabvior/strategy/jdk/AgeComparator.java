package com.liang.designpattern.behabvior.strategy.jdk;

import java.util.Comparator;

/**
 * ClassName: AgeComparator
 * Package: com.liang.designpattern.behabvior.strategy.jdk
 * Description:
 *
 * @Author liang
 * @Create 2025/5/15 15:45
 */
public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
     int a = o1.age-o2.age;
        return -a;
    }
}
