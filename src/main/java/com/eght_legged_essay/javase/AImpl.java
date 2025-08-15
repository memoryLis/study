package com.eght_legged_essay.javase;

/**
 * ClassName: AImpl
 * Package: com.eght_legged_essay.javase
 * Description:
 *
 * @Author liang
 * @Create 2025/8/14 21:46
 * @Version jdk17.0
 */
public  class AImpl  implements A
{
    @Override
    public void method() {
        defaultMethod();
    }

    public static void main(String[] args) {
        A a = new AImpl();
        a.defaultMethod();
    }
}
