package ThreadPack;

public class JTDemo7 extends Thread {

    @Override
    public void run() {

        System.out.println("Thread run method is running ");
    }

    public static void main(String[] args) {

        JTDemo7 jObj1 = new JTDemo7();
        JTDemo7 jObj2 = new JTDemo7();
        JTDemo7 jObj3 = new JTDemo7();

        jObj1.setPriority(MAX_PRIORITY);
        jObj2.setPriority(MIN_PRIORITY);
        jObj3.setPriority(NORM_PRIORITY);

        System.out.println("Thread 1 Priority " + jObj1.getPriority());
        System.out.println("Thread 2 Priority " + jObj2.getPriority());
        System.out.println("Thread 3 Priority " + jObj3.getPriority());

        jObj1.setPriority(2);
        jObj2.setPriority(5);
        jObj3.setPriority(8);

        System.out.println("Thread 1 Priority " + jObj1.getPriority());
        System.out.println("Thread 2 Priority " + jObj2.getPriority());
        System.out.println("Thread 3 Priority " + jObj3.getPriority());
    }

}
