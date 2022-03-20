package com.dotcomgame;

import java.util.ArrayList;

/**
 * DotComGame
 *
 */
public class DotComBust {
    // 实例变量
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();// 创建承载DotCom的ArrayList
    private int numOfGuesses = 0;// 记录玩家猜测次数
    // -------------------------------------------------------------------------------

    public DotComBust() {
    }

    private void setUpGame() {
        // 创建3个DotCom对象，设置名称并置入ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        // -------------------------------------------------------------------------------
        // 列出简短的提示
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com,eToys.com,Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        // -------------------------------------------------------------------------------
        for (DotCom dotComToSet : dotComsList) {// 对List中所有的DotCom
            ArrayList<String> newLocation = helper.placeDotCom(3);// 获取DotCom的位置
            dotComToSet.setLocatonCells(newLocation);// 调用DotCom的setter方法将取得的位置指派给DotCom
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {// 判断DotCom的List是否为空
            String userGuess = helper.getUserInput("enter a guess");// 取得玩家输入
            checkUserGuess(userGuess);// 调用checkUserGuess方法
        }
        finishGame();// 调用finishGame方法
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;// 递增玩家猜测次数的计数器
        String result = "miss";// 先假设没有命中
        for (DotCom dotComToTest : dotComsList) {// 对List中所有的DotCom
            result = dotComToTest.checkYourSelf(userGuess);// 检查玩家是否命中或击沉
            if (result.equals("hit")) {// 如果命中
                break;// 提前跳出循环
            }
            if (result.equals("kill")) {// 如果击沉
                dotComsList.remove(dotComToTest);// 将击沉的DotCom移出ArrayList
                break;
            }
        }
        System.out.println(result);// 列出结果
    }

    private void finishGame() {
        // 列出玩家成绩
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
            // -------------------------------------------------------------------------------
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();// 创建游戏对象
        game.setUpGame();// 初始化游戏
        game.startPlaying();// 玩家开始游戏
    }
}