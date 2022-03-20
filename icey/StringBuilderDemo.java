package com.icey;

/**
 * StringBuilder学习类
 */
public class StringBuilderDemo {
    public StringBuilderDemo() {
    }

    public void StringBuild() {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());
        StringBuilder sb2 = new StringBuilder("hello ");// 初始化时输入字符串
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.length():" + sb2.length());
        StringBuilder sb3 = sb.append("hello ");// 调用append方法添加字符串
        System.out.println("sb:" + sb);
        System.out.println("sb3:" + sb3);
        System.out.println(sb == sb3);// 结果为true,证明二者为同一对象,调用append方法返回StringBuilder对象本身
        sb.append("world ");//
        sb.append("java ");
        sb.append(666);
        // 链式编程
        sb2.append("world ").append("java ").append(888);
        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        sb.reverse();// 反转字符串
        System.out.println("sb:" + sb);
        String s = sb.toString();// StringBuilder转换为String
        System.out.println("s:" + s);
        StringBuilder sb4 = new StringBuilder(s);// String转换为StringBuilder
        System.out.println("sb4:" + sb4);
    }
}