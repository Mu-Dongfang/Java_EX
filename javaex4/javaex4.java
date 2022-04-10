package com.javaex4;

/**
 * 内部类
 */

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
     局部内部类是在方法中定义的类，所以外界无法直接使用，需要在方法内部创建对象并使用;
     该类可以直接访问外部类的成员,也可以访问方法内的局部变量
     匿名内部类:局部内部类的一种特殊形式,前提为存在一个类或者接口,实质为一个继承了该类或者实现了该接口的子类匿名对象
     创建格式:
     new 类名或接口名(){
        重写方法;
     };
     调用直接将最后一个分号换为.调用方法即可(貌似是一种lambda表达式)
     该对象可以直接赋值给父类或者所实现的接口,然后按照一般方法调用
     作用:匿名内部类可以作为子类或实现类对象直接重写方法然后作为参数传递给以类或者接口为形参的方法
     ex:
     o.method(new Inner(){
      @Override
            public void show() {
                System.out.println("匿名内部类");
            }
     });
     */

    private int num = 10;

    private class Inner {//成员内部类

        public void show() {
            System.out.println(num);
        }
    }

    public void method2() {
        int num2 = 20;
        class Inner2 {//局部内部类
            public void show() {
                System.out.println(num);
                System.out.println(num2);
            }
        }
        Inner2 i = new Inner2();
        i.show();
    }

    public void method() {//外界private可用
        Inner i = new Inner();
        i.show();
    }

    public void method3() {
        new Show(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
        Show s = new Show(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        s.show();
    }

    public static void main(String[] args) {
        javaex4.Inner oi = new javaex4().new Inner();//外界public可用
        oi.show();
        javaex4 m = new javaex4();
        m.method();//调用成员内部类
        javaex4 m2 = new javaex4();
        m2.method2();//调用局部内部类
        javaex4 m3 = new javaex4();
        m3.method3();//调用匿名内部类
    }
}
