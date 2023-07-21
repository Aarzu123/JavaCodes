package ThreadPack;

public class JTDemo2 implements Runnable {

    @Override
    public void run() {

        try {
            System.out.println("This code is running in a thread using interface !!!");
            System.out.println(Thread.currentThread().getName());
        } catch (Exception ieObj) {

        }
    }
}
