package mypack;

import java.util.function.BiFunction;
import java.util.function.Function;

public class JFIDemo1 {

    public static void main(String[] args) {

        System.out.println(changeCase("Java New Features ", str -> str.toLowerCase()));

        System.out.println(subString("Java New Features ", 3, (str, i) -> str.substring(i)));

    }

    public static String changeCase(String str, Function<String, String> pd) {
        return pd.apply(str);
    }

    public static String subString(String str, int i, BiFunction<String, Integer, String> pd) {
        return pd.apply(str, i);
    }
}
