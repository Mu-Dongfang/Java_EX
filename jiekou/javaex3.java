package com.jiekou;

public class javaex3 implements pet{
    /*
      接口是一种公共的规范标准，只要符合规范标准，大家都可以通用
      Java中的接口更多的体现在对行为的抽象
      接口就好像是100%纯天然抽象类
      定义接口的关键字为interface
      接口的方法默认被public和abstract修饰,声明时可以不写关键字
      接口的成员变量默认被public、static和final修饰，声明时可以不写关键字
      接口和接口之间可以多继承
      抽象类主要是对事物进行抽象，包括属性和行为
      接口主要是对行为的抽象，主要是行为
      调用接口格式：(一个类可以调用多个接口)
      ... implements 接口名 , 接口名 , ...
      分析时从具体到抽象,实现时从抽象到具体
    */
    public void eat(){
    }
}