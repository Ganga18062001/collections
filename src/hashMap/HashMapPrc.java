package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPrc {
    public static void main(String[] args) {
        HashMap<Integer,String> hp = new HashMap();
        hp.put(100,"aaa");
        hp.put(111,"bbb");
        hp.put(222,"ccc");
        hp.put(333,"ddd");

        System.out.println(hp);
        for(Map.Entry me : hp.entrySet()){
            System.out.println(me.getKey());
//            System.out.println(me.getValue());
        }

     //   Set set = hp.entrySet();
//        System.out.println(set);
      //  Iterator i = set.iterator();

//        while (i.hasNext()){
////            System.out.println(i.next());
//            Map.Entry entry = (Map.Entry) i.next();
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }


    }
}
