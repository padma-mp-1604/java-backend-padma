package optionalclass2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        String s1 = null;

        Optional<String> offNullaable = Optional.ofNullable(s1);
//        System.out.println(offNullaable.get());
//        System.out.println(offNullaable.isPresent());

//        String defaultOptional =offNullaable.orElse("no value");
//        System.out.println(defaultOptional);

//        String defaultOptional =offNullaable.orElseGet(()->"no value");
//        System.out.println(defaultOptional);

        String defaultOptional =offNullaable.orElseThrow(()-> new IllegalArgumentException("no value"));
        System.out.println(defaultOptional);




    }
}
