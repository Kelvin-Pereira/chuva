package main;

import java.util.Random;

public class RandomValues {

    static Random random = new Random();

    private RandomValues(){}

    public static int nextInt(int value) {
        return random.nextInt(value);
    }

    public static int nextInt(int value1, int value2) {
        return random.nextInt(value1, value2);
    }

}
