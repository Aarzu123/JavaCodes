package ThreadPack;

public class JTDemo5 extends Thread {

    private String data;

    public JTDemo5(String data) {
        this.data = data;
    }

    @Override
    public void run() {

        while (JTMain5.start) {
            System.out.println("Enter the Data ");

            try {
                Thread.sleep(3000);
            } catch (Exception eObj) {

            }
        }
    }
}
