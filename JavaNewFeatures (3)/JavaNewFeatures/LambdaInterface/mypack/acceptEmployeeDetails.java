package mypack;

import java.util.ArrayList;
import java.util.List;

public class acceptEmployeeDetails {

    public static void main(String[] args) {

        ArrayList<Integer> empSal = new ArrayList<Integer>();

        Consumer<String> displayData = x -> System.out.println(x);

        displayData.accept("Hello World .....");

        empSal.add(21);
        empSal.add(22);
        empSal.add(23);

        Consumer<Integer> displayEmpSal = x -> {

            x = x + 10;
            System.out.println(x);
        };

        fetchData(empSal, displayEmpSal);
    }

    public static <T> void fetchData(List<T> lData, Consumer<T> consume) {
        for (T t : lData) {
            consume.accept(t);
        }
    }
}
