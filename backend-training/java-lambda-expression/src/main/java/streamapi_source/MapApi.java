package streamapi_source;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapApi {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//
//        int result = 0;
//        for (int i : list) {
//            result = result + i * 2;
//
//        }
        System.out.println(list.stream().map(i ->i*2).reduce(0,(c,e)->c+e));

     List<String> list1 = Arrays.asList("a", "b", "c", "d");

     List<String> collect =list1.stream().map(String::toUpperCase).collect(Collectors.toList());
     System.out.println(collect);



     List<Integer> num =Arrays.asList(1,2,3,4,5);
     List<Integer> collect1 = num.stream().map(n -> n%2).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
