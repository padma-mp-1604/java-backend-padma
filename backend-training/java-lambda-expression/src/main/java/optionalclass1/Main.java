package optionalclass1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name =null;

        Optional<String> ofOptional = Optional.of(name); // if the value is present it will return value otherwise throws
       // System.out.println(ofOptional);                  // NullPointerException
//        System.out.println(ofOptional.isPresent());
//        System.out.println(ofOptional.get());

        String defaultOptional = ofOptional.orElse("no value");
        System.out.println(defaultOptional);

    }

}
