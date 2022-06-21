package collectionprogram;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProgram {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("mango");
        System.out.println(list);

        list.remove("banana");
        System.out.println(list);

        System.out.println(list.contains("apple"));

       // list.clear();
        //System.out.println(list);

        System.out.println(list.isEmpty());

        System.out.println(list.size());

        System.out.println(list.hashCode());

        list.forEach((element) -> System.out.println(element));

        System.out.println(list.retainAll(list));

    }

}
