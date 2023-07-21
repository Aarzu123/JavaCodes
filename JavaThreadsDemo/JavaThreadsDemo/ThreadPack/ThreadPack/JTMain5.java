package ThreadPack;

import java.util.Scanner;

public class JTMain5 {

    public static boolean start = true;

    public static void main(String[] args) {

        JTDemo5 jtObj = new JTDemo5("From Main Class");

        jtObj.start();

        Scanner sin = new Scanner(System.in);

        sin.nextLine();

        JTMain5.start = false;
    }
}
