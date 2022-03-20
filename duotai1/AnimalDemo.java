package com.duotai1;

/**
 * 动物测试类
 */

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        // 向上转型,父类引用指向子类对象,编译看左边,运行看右边
        Animal c = new Cat();
        ao.useAnimal(c);
        Animal d = new Dog();
        ao.useAnimal(d);
        Animal p = new Pig();
        ao.useAnimal(p);
        // 向下转型,父类引用转为子类对象
        Cat cat = (Cat)c;
        ao.useAnimal(cat);// 多态
        cat.playGame();
        Dog dog = (Dog)d;
        ao.useAnimal(dog);// 多态
        dog.lookDoor();
    }
}