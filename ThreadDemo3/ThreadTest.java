/**
 * ThreadTest creates 5 threads and runs them simultaneously.
 * Each thread will print an x at a random time between 300 and 800 ms.
 * This example uses threads which extend Thread.
 * Part of an example of multi-threading for an exercise from 
 * Teach Yourself Java.
 * 7/19/12
 * @author PhoenixElijah
 */
public class ThreadTest {
//===========================================================================
    public static void main(String args[]){
        //Create instances of five threads and let them run to completion.
        ThreadA ta = new ThreadA();
        ta.start();
        ThreadA tb = new ThreadA();
        tb.start();
        ThreadA tc = new ThreadA();
        tc.start();
        ThreadA td = new ThreadA();
        td.start();
        ThreadA te = new ThreadA();
        te.start();
        try{
            ta.join();
            tb.join();
            tc.join();
            td.join();
            te.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }   
//===========================================================================
}
