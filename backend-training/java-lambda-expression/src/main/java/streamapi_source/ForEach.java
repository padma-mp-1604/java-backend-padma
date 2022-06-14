package streamapi_source;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("pqr");
        list.add("lmn");
        list.add("xyz");

        list.forEach(i -> System.out.println(i));

        list.forEach(System.out::println);

        //forEachOrder() Iterating by passing lambda expression
        list.stream().forEachOrdered(i -> System.out.println(i));

        //forEachOrder() Iterating by passing lambda expression
        list.stream().forEachOrdered(System.out::println);




    }

}
