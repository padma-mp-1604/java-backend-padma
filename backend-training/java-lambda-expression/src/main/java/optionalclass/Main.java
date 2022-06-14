package optionalclass;

import java.util.Optional;

//optional is mainly used for handle the null pointerException

public class Main {
    public static void main(String[] args) {
      //  String s1 =null;
        //  Optional<String> ofOptional = Optional.of(s1);
//        System.out.println(ofOptional);

        String s2 = null;
//        Optional<String> ofOptional1 = Optional.of(s2);
//        System.out.println(ofOptional1);
//
//        Optional<String> emtyOptional =Optional.empty();
//        System.out.println(emtyOptional);
//
        Optional<String> offNullaable = Optional.ofNullable(s2);
        //System.out.println(offNullaable.get());
       // System.out.println(offNullaable.isPresent());

        String defaultOptional =offNullaable.orElse("no value");
        System.out.println(defaultOptional);

    }
}