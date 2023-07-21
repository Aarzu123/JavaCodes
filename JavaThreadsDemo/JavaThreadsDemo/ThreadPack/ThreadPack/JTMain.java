package ThreadPack;

public class JTMain {
    public static void main(String[] args) {

        Thread tObj1 = new JTDemo3(3);

        tObj1.start();

        Thread tObj2 = new JTDemo3(2);

        tObj2.start();

        // JTDemo1 jObj1 = new JTDemo1();
        // jObj1.start();

        // System.out.println(jObj1.getName());
        // System.out.println(jObj1.getState());

        // JTDemo2 jObj2 = new JTDemo2();
        // Thread tObj = new Thread(jObj2);
        // tObj.start();

    }
}
