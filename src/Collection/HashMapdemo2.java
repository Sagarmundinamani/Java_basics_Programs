package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HashMapdemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> h1=new HashMap<>();
        h1.put(10,"hello");
        h1.put(20,"x");
        System.out.println(h1);
        LinkedHashMap lm=new LinkedHashMap<>();
        lm.put(10,'a');
        lm.put(20,'b');
        lm.put(30,'c');
        System.out.println(lm);

    }
}
