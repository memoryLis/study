package com.liang.designpattern.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * ClassName: LombokTest
 * Package: com.liang.designpattern.creational.builder
 * Description:
 *
 * @Author liang
 * @Create 2025/5/10 18:15
 */
@Builder
@Getter
@ToString
public class LombokTest {
    private int id;
    private int age;
    private String name;

 public static void main(String[] args) {
  LombokTestBuilder lombokTestBuilder = new LombokTestBuilder();

 }


}
