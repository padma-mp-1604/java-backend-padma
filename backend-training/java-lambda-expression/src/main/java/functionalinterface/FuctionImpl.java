package functionalinterface;

import java.util.function.Function;

public class FuctionImpl implements FunctionDemo<String, Integer> {

    @Override
    public Integer apply(String s){
        return s.length();
    }

}


