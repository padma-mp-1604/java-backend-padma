package functionalinterface;

import java.util.function.Function;

public class FuctionImpl implements Function<String, Integer> {

    @Override
    public Integer apply(String s){
        return s.length();
    }

}


