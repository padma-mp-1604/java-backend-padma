package collectionprogram;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);

        numbers.remove(2);  // remove()
        System.out.println(numbers);

//        numbers.removeAll(numbers);
//        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);

        //Enhance for loop
        for (Integer numb : numbers){
            System.out.println(numbers);
        }

        //for



    }
}
