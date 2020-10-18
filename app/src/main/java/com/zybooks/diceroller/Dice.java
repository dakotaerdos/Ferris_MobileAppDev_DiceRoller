package com.zybooks.diceroller;

import java.util.Random;

public class Dice {

    Random random = new Random();

    public int Roll(int n) {
        int rolledNumber = 0;
        switch (n) {
            case 2:
                rolledNumber = random.nextInt(2) +1;
                break;
            case 4:
                rolledNumber = random.nextInt(4) +1;
                break;
            case 6:
                rolledNumber = random.nextInt(6) +1;
                break;
            case 8:
                rolledNumber = random.nextInt(8) +1;
                break;
            case 10:
                rolledNumber = random.nextInt(10) +1;
                break;
            case 12:
                rolledNumber = random.nextInt(12) +1;
                break;
            case 20:
                rolledNumber = random.nextInt(20) +1;
                break;
            case 100:
                rolledNumber = random.nextInt(100) +1;
                break;
        }

        return rolledNumber;
    }
}
