package streamapi_source;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindingElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        //findFirst element
        Optional<Integer> element = list.stream().findFirst();
         if(element.isPresent()){
             System.out.println(element.get());
         }
         else {
             System.out.println("Stream is empty");
         }

         //findAny element
         Optional<Integer> element1 = list.stream().findAny();
         if(element1.isPresent()){
             System.out.println(element1.get());
         }
         else{
             System.out.println("stream is empty");
         }

         //count()
        Stream<Integer> count1 = Stream.of(1,2,3,4,5,6,7);
        System.out.println(count1.count());

        //min()
        Integer min1 = Stream.of(1,2,3,4,5,6,7).
                min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(min1);

        //max()
        Integer max1 = Stream.of(1,2,3,4,5,6,7).
                max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(max1);
    }
}
