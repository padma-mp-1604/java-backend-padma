package streamapi_source;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingAndDescending {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("kiwi");

        //Ascending order
        List<String> sortedList1 = list.stream()
                                 .sorted(Comparator.naturalOrder())
                                 .collect(Collectors.toList());
        System.out.println(sortedList1);

        List<String> sortedList2 = list.stream()
                .sorted((o1, o2) ->o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println(sortedList2);

        //Descending Order
        List<String> sortedList3 = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList3);

        List<String> sortedList4 = list.stream()
                .sorted((o1, o2) ->o2.compareTo(o1))
                .collect(Collectors.toList());
        System.out.println(sortedList4);

    }
}
