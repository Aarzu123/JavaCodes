package StreamAPIPack;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {

    static List<String> dataLst = Arrays.asList("Test1", "Test2", "", "", "", "Test3", "Test3");

    public static void main(String[] args) {

        long count = dataLst.stream()
        .filter(x -> x.isEmpty())
        .count();

        System.out.println(count);

        long checklength = dataLst.stream()
                .filter(x -> x.length() > 4)
                .count();

        System.out.println(checklength);
    }

}