package collectionprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // create ArrayList Object
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //List<Integer> list1 = new ArrayList<>(list);


        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(list);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list.addAll(list2);
        System.out.println(list2);

        System.out.println("-------------------");

        list.removeAll(list2);        // remove all method
        System.out.println(list);

    }
}
