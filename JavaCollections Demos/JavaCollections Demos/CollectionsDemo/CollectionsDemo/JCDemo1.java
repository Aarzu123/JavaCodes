package CollectionsDemo;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class JCDemo1 {

    public static void main(String[] args) {

        ArrayList empDetails = new ArrayList<>();

        empDetails.add(1001);
        empDetails.add("Tim");
        empDetails.add(23);
        empDetails.add("India");
        empDetails.add(1001);
        empDetails.add("Tim");
        empDetails.add(23);
        empDetails.add("India");

        empDetails.add(3, "Pune");

        ArrayList empHistoryDetails = new ArrayList<>();

        empHistoryDetails.addAll(empDetails);

        for (Object empObj : empDetails) {
        System.out.println(empObj);
        }
       
        Iterator empdItr = empDetails.iterator();

        while (empdItr.hasNext()) {
        System.out.println(empdItr.next());
        }

        for (Object empHObj : empHistoryDetails) {
        System.out.println(empHObj);
        }

        ListIterator empdItr1= empDetails.listIterator();

        System.out.println("Forward Direction .........");
        while (empdItr.hasNext()) {
        System.out.println(empdItr.next());
        }

        System.out.println("Reverse Direction .........");
        while (empdItr1.hasPrevious()) {
        System.out.println(empdItr1.previous());
        }

        empDetails.forEach(System.out::println);

    }
}