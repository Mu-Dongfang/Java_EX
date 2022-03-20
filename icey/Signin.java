package com.icey;

import java.util.Scanner;

/**
 * 登录系统
 *
 */
public class Signin {
    private String username = "admin";
    private String password = "123456";

    public Signin() {
    }

    private void St() {
        for (int i = 0; i < 3; i++) {// 次数明确,采用for循环
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String name = sc.nextLine();
            System.out.println("请输入密码:");
            String pwd = sc.nextLine();
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else if ((2 - i) == 0) {
                System.out.println("登录次数用尽,你的账户已被锁定,请与管理员联系");
            } else {
                System.out.println("登陆失败,你还有" + (2 - i) + "次机会");
            }
            if (i == 2) {
                sc.close();
            }
        }
    }

    public void login() {
        Signin st = new Signin();
        st.St();
    }
}