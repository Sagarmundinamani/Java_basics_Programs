package Collection;

import java.util.ArrayList;

public class ArrayLists1 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList<>();
        a1.add(14);
        a1.add(18);
        a1.add("sagar");
        a1.add(false);
        a1.add('x');
        a1.add(13.18);
        a1.add(18);
//        for(int i=0; i<a1.size(); i++){
//            System.out.println(a1.get(i));
        for(Object o:a1){
            System.out.println(o);
        }

    }
}
