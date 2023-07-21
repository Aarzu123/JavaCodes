package CollectionsDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JCDemo4 {

    public static void main(String[] args) {

        HashSet<String> empName = new HashSet<String>();

        empName.add("Tim");
        empName.add("Tim");
        empName.add("Rim");
        empName.add("Jim");
        empName.add("Kim");
        empName.add("Sim");

        HashSet<Integer> empAge = new HashSet<Integer>();

        empAge.add(23);
        empAge.add(23);
        empAge.add(22);
        empAge.add(21);
        empAge.add(24);
        empAge.add(25);

        empName.forEach(System.out::println);
        empAge.forEach(System.out::println);

        // LinkedHashSet<String> empName = new LinkedHashSet<String>();

        // empName.add("Tim");
        // empName.add("Tim");
        // empName.add("Rim");
        // empName.add("Jim");
        // empName.add("Kim");
        // empName.add("Sim");

        // LinkedHashSet<Integer> empAge = new LinkedHashSet<Integer>();

        // empAge.add(23);
        // empAge.add(23);
        // empAge.add(22);
        // empAge.add(21);
        // empAge.add(24);
        // empAge.add(25);

        // empName.forEach(System.out::println);
        // empAge.forEach(System.out::println);

        TreeSet<String> empName1 = new TreeSet<String>();

        empName.add("Tim");
        empName.add("Tim");
        empName.add("Rim");
        empName.add("Jim");
        empName.add("Kim");
        empName.add("Sim");

        TreeSet<Integer> empAge1 = new TreeSet<Integer>();

        empAge.add(23);
        empAge.add(23);
        empAge.add(22);
        empAge.add(21);
        empAge.add(24);
        empAge.add(25);

        empName.forEach(System.out::println);
        empAge.forEach(System.out::println);

        Iterator nmItr = empName1.descendingIterator();

        while (nmItr.hasNext()) {
            System.out.println(nmItr.next());
        }

        Iterator agItr = empAge1.descendingIterator();

        while (agItr.hasNext()) {
            System.out.println(agItr.next());
        }
    }
}