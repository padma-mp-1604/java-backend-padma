package streamapi_source;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamsObjects {

    public static void main(String[] args) {

        //Create  Stream
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);

        //Creating Stream from Source

        Collection<String> collection = Arrays.asList("ABC", "pqr", "xyz");
        Stream<String> stream1 = collection.stream();
        stream1.forEach(System.out::println);

        List<String> list = Arrays.asList("car", "bike");
        Stream<String> stream2=list.stream();
        stream2.forEach(System.out::println);

        Set<String> set= new HashSet<>(list);
        Stream<String> stream3=set.stream();
        stream3.forEach(System.out::println);

        String[] array = {"a", "b", "c"};
        Stream<String> stream4= Arrays.stream(array);
        stream4.forEach(System.out::println);

    }

}