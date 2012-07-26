/**
 * ThreadTest creates two threads and runs them simultaneously.
 * This example uses threads which extend Thread.
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
        ta.start();
        ThreadB tb = new ThreadB();
        tb.start();
        //Combine both threads.
        try{
            ta.join();
            tb.join();
            System.out.println("Both threads have finished");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }   
//===========================================================================
}
