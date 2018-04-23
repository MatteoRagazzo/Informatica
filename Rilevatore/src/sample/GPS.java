package sample;

import java.util.concurrent.TimeUnit;

public class GPS extends Thread {

    private long tempo;

    public GPS(long tempo){
        this.tempo=tempo;
    }

    public void run(){
        try {
            for (; ; ) {
                System.out.println(GeneratorePosizioni.getLat());
                System.out.println(GeneratorePosizioni.getLong());
                TimeUnit.SECONDS.sleep(tempo);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
