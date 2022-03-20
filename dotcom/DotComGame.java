package com.dotcom;

import java.util.ArrayList;

/**
 * DotComGame
 *
 */
public class DotComGame {
    public static void main(String[] arg) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom theDotCom = new DotCom();
        //int randomNum = (int) (Math.random() * 5);
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("3");
        locations.add("4");
        locations.add("5");
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            System.out.println(result);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}