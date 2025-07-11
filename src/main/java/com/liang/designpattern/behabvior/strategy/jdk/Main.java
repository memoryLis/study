package com.liang.designpattern.behabvior.strategy.jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Main
 * Package: com.liang.designpattern.behabvior.strategy.jdk
 * Description:
 *
 * @Author liang
 * @Create 2025/5/15 15:46
 */
public class Main {
    public static void main(String[] args) {
     Student a = new Student(1, "a", 1);
     Student b = new Student(2, "b", 1);
     Student c = new Student(3, "c", 1);
     Student d = new Student(4, "d", 1);
     List<Student> list = new ArrayList<>();
     list.add(a);list.add(b);list.add(c);list.add(d);
     System.out.println(list);
     list.sort(new AgeComparator());
     System.out.println(list);

    }
}
