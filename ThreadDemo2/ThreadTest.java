/**
 * ThreadTest creates two threads and runs them simultaneously.
 * This example uses threads which implement Runnable.
 * Part of an example of multi-threading for an exercise from 
 * Teach Yourself Java.
 * 7/19/12
 * @author PhoenixElijah
 */
public class ThreadTest {
//===========================================================================
    public static void main(String args[]){
        //Create instances of both threads and start them.
        ThreadA ta = new ThreadA();
        Thread tta = new Thread(ta);
        tta.start();
        ThreadB tb = new ThreadB();
        Thread ttb = new Thread(tb);
        ttb.start();
        //Combine both threads.
        try{
            tta.join();
            ttb.join();
            System.out.println("Both threads have finished");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }   
//===========================================================================
}
