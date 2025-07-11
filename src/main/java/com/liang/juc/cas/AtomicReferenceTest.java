package com.liang.juc.cas;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.LongAdder;

/**
 * ClassName: AtomicReferenceTest
 * Package: com.liang.juc.cas
 * Description:
 *
 * @Author liang
 * @Create 2025/4/17 15:48
 * @Version jdk11
 */
public class AtomicReferenceTest {
    private  static AtomicReference<BigDecimal> reference = new AtomicReference<>(new BigDecimal("10000"));
    public static void main(String[] args) {
        BigDecimal bigDecimal  = new BigDecimal("151");
        LongAdder longAdder = new LongAdder();
        long sum = longAdder.sum();
        System.out.println(sum);

    }
}
