package com.duotai2;

/**
 * 测试类
 */

public class AnimalDemo {

    public static void main(String[] arg) {
        //创建类对象并进行测试
        Animal c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();

        Animal d = new Dog("汤姆", 6);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
    }
}