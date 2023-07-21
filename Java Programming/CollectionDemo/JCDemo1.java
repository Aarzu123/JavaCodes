package CollectionDemo;
import java.util.ArrayList;
public class JCDemo1{
   public static void main(String[] args) {
    {
        ArrayList empDetails= new ArrayList<>();
        empDetails.add(1001);
        empDetails.add("Arzu");
        ArrayList empHistoryDetails =new ArrayList<>();  
        empHistoryDetails.add("Pune");     
      //  empHistoryDetails.addAll();
        //list iterator-->forward and reverse direction
        empDetails.forEach(System.out::println);
    }
    
}
}