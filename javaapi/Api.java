package com.javaapi;

/**
 * 常用API
 */

/*
   Math的常用方法被静态修饰,直接以Math.方法名()调用即可
   abs(m):返回参数的绝对值
   ceil(m):返回大于等于参数的最小整数double值
   floor(m):返回小于等于参数的最大整数double值
   round(m):按四舍五入返回最接近参数的整数int值
   max(m,n):返回两个参数中的较大值
   min(m,n):返回两个参数中的较小值
   pow(m,n):返回m的n次幂的double值
   random():返回范围在[0.0,1.0),double类型的随机数
 */

/*
    System类不能被实例化,常用方法被静态修饰,直接以Math.方法名()调用即可
    exit(int status):终止当前运行的Java虚拟机,非0表示异常终止
    currentTimeMillis():返回当前时间距离1970.1.1的毫秒值,可用于输出时间以及计算代码运行时间
 */

/*
    Object类为类层次结构的根,每个类都可以将Object作为超类,所有类都直接或间接继承自该类
    按下Ctrl移动鼠标指针即可看源码,或者选中方法或类后右键转到
    toString():返回对象的字符串表示形式;
    建议所有子类重写toString()方法,右键生成即可,返回值为对象的成员变量集合
    equals():比较对象是否相等,默认比较地址;String类中对equals()进行了重写,改为比较字符串内容是否相等
    自动重写后会比较对象的所有成员变量是否相同,相同返回true,不同返回false
 */
public class Api {
    public static void main(String[] args) {
        System.out.println(Math.abs(-88.88));
        System.out.println(Math.abs(13.14));
        System.out.println(Math.ceil(88.88));
        System.out.println(Math.ceil(13.14));
        System.out.println(Math.floor(88.88));
        System.out.println(Math.floor(13.14));
        System.out.println(Math.round(88.88));
        System.out.println(Math.round(13.14));
        System.out.println(Math.max(13, 14));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.random());
        System.out.println((int) ((Math.random()) * 100));//[0,100)随机整数
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时:" + (end - start) + "毫秒");
    }
}