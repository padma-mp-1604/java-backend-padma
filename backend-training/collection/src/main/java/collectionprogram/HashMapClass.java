package collectionprogram;

import java.security.Key;
import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {

        Map<String, Integer> num = new HashMap<>();
        num.put("one", 1);
        num.put("two", 2);
        num.put("three",3);
        num.put("four",4);
        System.out.println(num);

        num.put("null",5);
        num.put("null",6);
        System.out.println(num);

        System.out.println(num.isEmpty());     // it returns true or false

        System.out.println(num.size());        // it is used for find size of HashMap

//        if(num.containsKey("seven")){           //Check Key exist or not. It returns boolean result so we use if condition
//            System.out.println("exist");
//        }
//        else {
//            System.out.println("key not exist");
//        }

        System.out.println(num.containsKey("one"));
        System.out.println(num.containsValue(9));   //Check value exist or not. It returns boolean result so we use if condition
//
        Integer v1 = num.get("three");             // get value by key
        System.out.println(v1);

//        num.remove("one");                     //remove key from hashMap
//        System.out.println(num);

        Set<String> key = num.keySet();            // key set() return set of key from method
        System.out.println(key);

        Collection<Integer> values = num.values();
        System.out.println(values);
//
//        //Different way to iterate
//        //map has entry interface just call it and pass type of key values appear string and integer
//        //entrySet basically returns a set of entries and entry contains key values pair
//
//        for (Map.Entry<String, Integer> entry:num.entrySet()){                 // for each method
//            System.out.println("key -> "+ entry.getKey() + "  values -> " +entry.getValue());
//        }
//
//        //hashMap using java 8 forEach
//        num.forEach((K, V) -> {
//            System.out.println("key "+K);
//            System.out.println("value " +V);
//        });
//
//        System.out.println("-------");
//
//        //using Iterator
//        Set<Map.Entry<String, Integer>> entries = num.entrySet();   // ----> we got set of entries here
//        Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, Integer> entry = iterator.next();   // call its next() to get next entry
//            System.out.println("keys -> "+ entry.getKey() + "  values -> " +entry.getValue());
//        }

    }
}
