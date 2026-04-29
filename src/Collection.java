import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
//        HashMap h = new HashMap();
//        h.put(101,"AAA");
//        h.put(102,"bbb");
//        System.out.println(h);

//        List l = new ArrayList();
//        l.add(100);
//        l.add("TDiT");
//        l.add('s');
//        System.out.println(l);

//        ArrayList ar = new ArrayList();
//        ar.isEmpty();
//
//        ar.add('d');
//        ar.add("ram");
//        ar.add("rahim");
//
//        System.out.println( ar.isEmpty());
//        System.out.println(ar);
//
//        ArrayList arr1 = new ArrayList();
//        arr1.add(100);
//        arr1.add(200);
//        arr1.add(300);
//        System.out.println(arr1);
//
//        arr1.addAll(ar);
//        ar
//        System.out.println(arr1);
//        System.out.println(arr1.contains(100));
//        System.out.println(arr1.isEmpty());

        ArrayList a = new ArrayList();
        a.add(0,100);
        a.add(200);
        a.add(300);
        a.add("aaa");
        System.out.println(a);
       a.clear();
//        a.remove(00);
//        a.remove("aaa");
        System.out.println(a);
        ArrayList b = new ArrayList();
        b.add("bbb");
        b.add("ccc");
        b.add("aaa");
        System.out.println(b);

        b.removeAll(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b.contains(100));
        System.out.println(a.containsAll(b));

    }
}
