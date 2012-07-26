import java.util.Random;
/**
 * Part of an example of multi-threading for an exercise from 
 * Teach Yourself Java.
 * 7/19/12
 * @author PhoenixElijah
 */
public class ThreadA extends Thread {
    Random rand = new Random();
    int wait;
    
//===========================================================================
//@Override run() from Thread
    public void run() {
        try {
            for(int i = 0; i<10; i++){
                wait = (rand.nextInt(500)+300);
                System.out.println(wait);
                Thread.sleep(wait);
                System.out.println("X");
            }
        }
        catch(InterruptedException exc) {
            exc.printStackTrace();            
        }
    }
//===========================================================================
}
