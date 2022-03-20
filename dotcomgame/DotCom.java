package com.dotcomgame;

import java.util.ArrayList;

/**
 * DotCom
 *
 */
public class DotCom {
    // 实例变量
    private ArrayList<String> locationCells;// 保存位置的ArrayList
    private String name;// DotCom的名称
    // -------------------------------------------------------------------------------

    public DotCom() {
    }

    public void setLocatonCells(ArrayList<String> loc) {// 更新DotCom位置的setter方法
        locationCells = loc;
    }

    public void setName(String name) {// 设置名称的setter方法
        this.name = name;
    }

    public String checkYourSelf(String userInput) {
        String result = "miss";
        // 使用indexOf()方法判断玩家猜测的值是否出现在ArrayList中.如果玩家猜中,这个方法会返回它的位置;如果没有的话会返回-1
        int index = locationCells.indexOf(userInput);
        // -------------------------------------------------------------------------------
        if (index >= 0) {// 如果索引值大于等于0,命中!
            locationCells.remove(index);// 删除已经命中的格子
            if (locationCells.isEmpty()) {// 判断是否击沉,全部清空则表示击沉
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :(");// 列出击沉的信息
            } else {
                result = "hit";
            }
        }
        return result;// 返回状态
    }
}