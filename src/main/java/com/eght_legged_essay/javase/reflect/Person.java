package com.eght_legged_essay.javase.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Person
 * Package: com.eght_legged_essay.javase.reflect
 * Description:
 *
 * @Author liang
 * @Create 2025/8/18 16:41
 * @Version jdk17.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@MyAnnotation(value = 1, name = "liang")
public class Person {
    int age;
    String name;


}
