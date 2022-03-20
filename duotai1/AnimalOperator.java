package com.duotai1;

/**
 * 动物操作类
 */

public class AnimalOperator {
    public void useAnimal(Animal a) {
        // 定义时可以使用父类作为参数,使用时使用具体子类参与操作,但是不能使用子类的特有功能
        a.eat();
    }
}