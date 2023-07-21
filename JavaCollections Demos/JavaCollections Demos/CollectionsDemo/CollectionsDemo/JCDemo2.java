package CollectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class JCDemo2 {
    public static void main(String[] args) {

        LinkedList empDetails = new LinkedList<>();

        empDetails.add(1001);
        empDetails.add("Tim");
        empDetails.add(23);
        empDetails.add("India");
        empDetails.add(1001);
        empDetails.add("Tim");
        empDetails.add(23);
        empDetails.add("India");

        empDetails.add(3, "Pune");

        LinkedList empHistoryDetails = new LinkedList<>();

        empHistoryDetails.addAll(empDetails);
        empHistoryDetails.addFirst(empHistoryDetails);
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

        ListIterator empdItr1 = empDetails.listIterator();

        System.out.println("Forward Direction .........");
        while (empdItr1.hasNext()) {
        System.out.println(empdItr1.next());
        }

        System.out.println("Reverse Direction .........");
        while (empdItr1.hasPrevious()) {
        System.out.println(empdItr1.previous());
        }

       empDetails.forEach(System.out::println);

    }

}
