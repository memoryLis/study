package com.liang.designpattern.behavior2.Iterator;

/**
 * ClassName: Student
 * Package: com.liang.designpattern.behavior2.Iterator
 * Description:
 *
 * @Author liang
 * @Create 2025/5/16 18:01
 */
public class Student {
    public static void main(String[] args) {


    }


    public static class teacher{
        Student student;
        public  teacher(Student student){
            this.student =student;
        }
        public  void eat(){
            System.out.println("吃饭");

        }

    }
}
