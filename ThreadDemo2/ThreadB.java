/**
 * Part of an example of multi-threading for an exercise from 
 * Teach Yourself Java.
 * 7/19/12
 * @author PhoenixElijah
 */
public class ThreadB implements Runnable {
//===========================================================================
//@Override run() from Thread
    public void run() {
        try {
            for(int i = 0; i<10; i++){
                Thread.sleep(3000);
                System.out.println("I'm thread B");        
            }
        }
        catch(InterruptedException exc) {
            exc.printStackTrace();    
        }
    }
//===========================================================================
}
