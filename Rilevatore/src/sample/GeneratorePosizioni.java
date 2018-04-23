package sample;
import java.lang.Math;

public class GeneratorePosizioni {

    private Math rnd;

    public GeneratorePosizioni(){
    }

    public static double getLat(){
        return 45.05 + (double)(Math.random() * (45.65-45.05));
    }

    public static double getLong(){
        return 11.88 + (double)(Math.random() * (12.38-11.88));
    }
}
