package Collection;

import java.util.HashMap;

public class HashMapdemo {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(10,"hello");
        hm.put(20,"x");
        hm.put(20.35,"sagar");
        hm.put(null,"usa");
        hm.put("sagar","hii");
        hm.put("sa","hello");
        System.out.println(hm);
        hm.remove(20);
        System.out.println(hm);
        System.out.println(hm.containsKey(20.35));
        System.out.println(hm.containsValue("hello"));
        System.out.println(hm.get(10));
        System.out.println(hm.get("usa"));
        System.out.println(hm.getOrDefault(30,"Rcb"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
        System.out.println(hm.size());
    }
}
