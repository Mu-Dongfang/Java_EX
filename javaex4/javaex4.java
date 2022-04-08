package com.javaex4;

public class javaex4 {
    /*
     内部类:即在一个类中定义的类.
     定义格式:
     public class 类名{
        修饰符 class 类名{
        }
     }
     访问特点:内部类可以直接访问外部类的成员,包括私有成员
             外部类要访问内部类的成员,必须创建对象
     根据内部类在类中定义的位置不同，可以分为如下两种格式：
        在类的成员位置：成员内部类
        在类的局部位置：局部内部类(只能在方法内部访问)
     外部调用public内部类可用格式:
     外部类名.内部类名 对象名 = 外部类对象.内部类对象;
     ex:Outer.Inner oi = new Outer().new Inner();
     一般内部类为private,此时应额外在外部类中创建一个方法以调用内部类中的成员
     */

    private int num = 10;

    private class Inner {//成员内部类

        public void show() {
            System.out.println(num);
        }
    }

    public void method2() {
        class Inner2 {//局部内部类

            public void show() {
                System.out.println(num);
            }
        }
        Inner i = new Inner();
        i.show();
    }

    public void method() {//外界private可用
        Inner i = new Inner();
        i.show();
    }

    public static void main(String[] args) {
        javaex4.Inner oi = new javaex4().new Inner();//外界public可用
        oi.show();
        javaex4 m = new javaex4();
        m.method();//调用成员内部类
        javaex4 m2 = new javaex4();
        m2.method2();//调用局部内部类
    }
}
