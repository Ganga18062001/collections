package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPrc {
    public static void main(String[] args) {
        HashMap<Integer,String> hp = new HashMap<>();
        hp.put(100,"aaa");
        hp.put(101,"bbb");
        hp.put(102,"ccc");
        hp.put(103,"ddd");
//        hp.put(null,100);
//        hp.put(null,"vvv");

        System.out.println(hp);
        //first way of retrive data
//        for(Map.Entry me : hp.entrySet()){
//            System.out.println(me);
////            System.out.println(me.getValue());
//        }

        //Secound way to retrive data
        Set<Integer> keys = hp.keySet();
        for(Integer key : keys){
            System.out.println(key+" "+hp.get(key));
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
