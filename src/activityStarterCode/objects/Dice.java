package activityStarterCode.objects;

import java.util.Random;

public class Dice {
    private int faceValue = -1;
    private int noArgument;
    private Random rand = new Random();
    private int max = 6;

    public int roll() {
        faceValue = rand.nextInt(max) + 1;
        return faceValue;
    }

    public int getFaceValue(){
        return faceValue;
    }




}
