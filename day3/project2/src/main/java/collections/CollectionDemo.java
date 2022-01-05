package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class CollectionDemo
{
    public List<String> listDemo() {
        ArrayList<String> names = new ArrayList<>();
        names.add("abc");
        names.add("pqr");
        names.add("lmn");
        names.add("xyz");
        names.add(null);
        names.add("xyz");

        Consumer<String> cls = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Name is " + s);
            }
        };
        names.forEach(cls);

        Consumer<String> fn = (String s) -> System.out.println(s);
        names.forEach(fn);

        return names;
    }

    public Set<String> setDemo()
    {
        HashSet<String> set=new HashSet<>();
        set.add("abc");
        set.add("pqr");
        set.add("lmn");
        set.add("xyz");
        set.add(null);
        set.add("xyz");

        set.forEach((s) -> System.out.println(s));

        return set;



    }

}
