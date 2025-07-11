package com.liang.designpattern.behabvior.strategy.jdk;

import com.google.errorprone.annotations.NoAllocation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Student
 * Package: com.liang.designpattern.behabvior.strategy.jdk
 * Description:
 *
 * @Author liang
 * @Create 2025/5/15 15:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    public int age;
    public String name;
    private int score;

}
