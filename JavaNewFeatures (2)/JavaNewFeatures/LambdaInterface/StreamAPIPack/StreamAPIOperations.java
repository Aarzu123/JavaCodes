package StreamAPIPack;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIOperations {

    static List<Student> stdList = Arrays.asList(

            new Student("Tim", 21, 5000.00),
            new Student("Rim", 19, 10000.00),
            new Student("Kim", 22, 7000.00),
            new Student("Jim", 18, 8000.00),
            new Student("Xim", 20, 4000.00));

    public static void main(String[] args) {

        // List<Student> filterStdList = stdList.stream()
        // .limit(3)
        // .collect(Collectors.toList());

        // System.out.println(filterStdList);

        // List<Student> filterStdListByAge = stdList.stream()
        // .filter((Student std) -> std.getStdAge() > 21)
        // .collect(Collectors.toList());

        // System.out.println(filterStdListByAge);

        // List<Student> filterStdListskip = stdList.stream()
        // .skip(2)
        // .collect(Collectors.toList());

        // filterStdListskip.forEach(System.out::println);

        // List<String> filterStdName = stdList.stream()
        // .map(std -> std.getStdName() + " " + std.getFeeAmount())
        // .collect(Collectors.toList());

        // filterStdName.forEach(System.out::println);

        // List<String> filterStdName = stdList.stream()
        // .filter((Student std) -> std.getStdAge() > 21)
        // .map(std -> std.getStdName() + " " + std.getFeeAmount())
        // .collect(Collectors.toList());

        // filterStdName.forEach(System.out::println);

        // double totalfee = stdList.stream()
        // .map(std -> std.getFeeAmount())
        // .reduce(0.00, (a, b) -> a + b);

        // System.out.println(totalfee);

        // Stream.iterate(0, n -> n + 2)
        // .peek(num -> System.out.println(num))
        // .forEach(System.out::println);
        // .limit(3)
        // .forEach(System.out::println);

        // IntStream streamOfCharacters = "Hello".chars();

        // Stream<String> streamOfStrings = Pattern.compile(",
        // ").splitAsStream("H,e,l,l,o");

        // System.out.println(streamOfStrings);

        String filterStdName = stdList.stream()
                .map(std -> std.getStdName())
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(" :: "));

        System.out.println(filterStdName);
    }
}