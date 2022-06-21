package collectionprogram;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("apple");
        System.out.println(fruits);

//        fruits.add(2, "kiwi"); // adding element to the specified position in  linkedList
//        System.out.println(fruits);
//
//        fruits.addFirst("Orange");      //adding element at the beginning of the LinkedList
//        System.out.println(fruits);
//
//        fruits.addLast("grapes");      //adding element at the end of the LinkedList
//        System.out.println(fruits);
//
//        String firstElement =fruits.getFirst();  //getting first element from the linkedList
//        System.out.println(firstElement);
//
//        String lastElement = fruits.getLast();   // getting lst element from the linkedList
//        System.out.println(lastElement);
//
//        String element = fruits.get(1);         //getting the element at a given position in the element
//        System.out.println(element);
//
//        for (String str : fruits) {
//            System.out.println(str);
//
//        }
//
//        fruits.removeFirst();
//        System.out.println(fruits);
//
//        fruits.removeLast();
//        System.out.println(fruits);
//
//        fruits.remove("mango");
//        System.out.println(fruits);
//
//        String str = fruits.get(2);
//        System.out.println(str);
//
//        fruits.clear();
//        System.out.println(fruits);

        //how to search an element from linked list and how to iterate over a linkedList

        int index = fruits.indexOf("apple"); //find the index of the first occurrence of an element in the LinkedList
        System.out.println(index);

        int lastIndex = fruits.lastIndexOf("apple"); //find the index of the first occurrence of an element in the LinkedList
        System.out.println(lastIndex);


        //How to iterate over LinkedList

        // 1. iterator
        Iterator<String> iterator =  fruits.iterator();
        while (iterator.hasNext()){
            String s1 = (String) iterator.next();
            System.out.println(s1);
        }
        System.out.println("-----------");


        //2. forEach
        fruits.forEach((i) -> System.out.println(i));

        //3.forEach Advanced
        for (String e : fruits){
            System.out.println(e);
        }
        System.out.println("---------");

        //simple for loop
    }

}
