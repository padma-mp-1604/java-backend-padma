package collectionprogram;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("lmn");
        list.add("pqr");
        list.add("xyz");
        System.out.println(list);

//        System.out.println(list.size()); //find size of an array

//        System.out.println(list.get(1)); // retrieve the element at the given index
//
//        System.out.println(list.isEmpty());

//        list.set(2, "hij");              //Modify the element at a given index
//        System.out.println(list);

//        list.remove(3);           // remove element by index
//        System.out.println(list);

//        list.remove("abc");           // remove element by element name
//        System.out.println(list);

//        System.out.println(list.hashCode());

//        list.clear();                 // remove all the element from list
//        System.out.println(list);

//        System.out.println(list.isEmpty());

//        List<String> sublist =new ArrayList<>(list);
//        sublist.add("aaa");
//        sublist.add("bbb");

//        list.removeAll(sublist);               //removeAll method
//        System.out.println(list);

        for (int i =0; i<list.size(); i++) {           //iterating by basic for loop
            System.out.println(list.get(i));
        }

        //Java 8 stream + lambda
        list.stream().forEach(i -> System.out.println(i));

        //java 8 forEach + lambda
        list.forEach(i -> System.out.println(i));

    }
}
