package ThreadPack;

public class JTDemo3 extends Thread {
    int num;

    public JTDemo3(int num1) {

        this.num = num1;
    }

    @Override
    public void run() {
        int ctr = 0;
        int checknum = 0;

        do {
            checknum = (int) (Math.random() * 100 + 1);
            System.out.println("Check Number " + checknum);
            ctr++;
        } while (checknum != num);

        System.out.println("Name   " + this.getName() + "  Counter " + ctr);
    }
}
