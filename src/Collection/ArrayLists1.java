package Collection;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists1 {
    public static void main(String[] args) {
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(new Car("ferrari","spider"));
        cars.add(new Car("bmw","i-7"));
        cars.add(new Car("audi","q8"));
        System.out.println(cars);
        cars.remove(new Car("bmw","i-7"));
        System.out.println(cars);
        System.out.println(cars.contains(new Car("audi","q8")));

//        ArrayList<Integer> a1=new ArrayList<>();
//        a1.add(14);
//        a1.add(18);
//        a1.add(20);
//        a1.add(false);
//        a1.add('x');
//        a1.add(13.18);
//        a1.add(18);
//        for(int i=0; i<a1.size(); i++){
//            System.out.println(a1.get(i));
//        for(Object o:a1){
//            System.out.println(o);
//        }
//        Iterator i= a1.iterator();
//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//        System.out.println(a1);
    }
}
