package utils;

import java.util.Random;

public class RandomUtils {
    private static final Random random =new Random();
    public static int getRandomChoice(){
        return random.nextInt(3);
    } 
    
}
