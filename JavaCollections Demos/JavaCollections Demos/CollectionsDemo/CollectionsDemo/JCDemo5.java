package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JCDemo5 {

    public static void main(String[] args) {

        //HashMap<Integer, String> productDetails = new HashMap<Integer, String>();

        TreeMap<Integer, String> productDetails = new TreeMap<Integer, String>();

        productDetails.put(102, "Product2");
        productDetails.put(101, "Product1");
        productDetails.put(105, "Product5");
        productDetails.put(104, "Product4");
        productDetails.put(103, "Product3");

        for (Map.Entry entr : productDetails.entrySet()) {

            System.out.println(entr.getKey() + "   " + entr.getValue());
        }

        System.out.println(productDetails.containsKey(101));
        System.out.println(productDetails.containsValue("Product1"));
    }
}