package ThreadPack;

import java.util.Scanner;

public class JTDemo6 {

    public static boolean start = true;

    public static void main(String[] args) {

        ChildThread jtObj = new ChildThread("From Main Class");

        jtObj.start();

        Scanner sin = new Scanner(System.in);

        sin.nextLine();

        JTDemo6.start = false;
    }

}

class ChildThread extends Thread {

    private String data;

    public ChildThread(String data) {
        this.data = data;
    }

    @Override
    public void run() {

        while (JTDemo6.start) {
            System.out.println("Enter the Data ");

            try {
                Thread.sleep(3000);
            } catch (Exception eObj) {

            }
        }
    }
}
