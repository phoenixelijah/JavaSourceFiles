/**
 * Part of an example of multi-threading for an exercise from 
 * Teach Yourself Java.
 * 7/19/12
 * @author PhoenixElijah
 */
public class ThreadA extends Thread {
//===========================================================================
//@Override run() from Thread
    public void run() {
        try {
            for(int i = 0; i<10; i++){
                Thread.sleep(1000);
                System.out.println("I'm thread A");
            }
        }
        catch(InterruptedException exc) {
            exc.printStackTrace();            
        }
    }
//===========================================================================
}
