/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfuzzylogic;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ali Alyasiry
 */
public class Number {

    Random randnum;
    char ch;
    int c;
    int sum;
    Scanner in = new Scanner(System.in);

    public Number(String line) {
        int array[] = new int[line.length()];
        for (int i = 0; i < line.length(); i++) {
            array[i] = (int)(line.charAt(i));
        }
        for (int i = 0; i < line.length(); i++) {
            sum = sum + array[i];
        }

        randnum = new Random();
        randnum.setSeed(sum);
    }

    public int random(int i) {
        return randnum.nextInt(i);
    }
}
