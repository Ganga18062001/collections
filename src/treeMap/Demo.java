package treeMap;

import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {

        TreeMap tp = new TreeMap();
//        tp.put(101,"aaa");
//        tp.put(102,"bbb");
//        tp.put(103,"ccc");
//        tp.put(100,"ddd");
        tp.put("zaaa",100);
        tp.put("bbb",101);
        tp.put("fff",105);
        tp.put("aa",1235);
//        tp.put(1,'t');

        System.out.println(tp);


//       System.out.println(tp.ceilingEntry("aaa"));
//        System.out.println(tp.ceilingKey("a"));//if key is not present print next value print
//
//        System.out.println(tp.floorEntry("bb"));//if key is not present it print previous value print
//        System.out.println(tp.get("ddd"));//null not present

//       System.out.println(tp.headMap("fff"));

//        System.out.println(tp.firstEntry());//first entry print

//        System.out.println(tp.higherEntry("zza"));
        //System.out.println(tp.keySet());//print hole key

//        System.out.println(tp.pollFirstEntry());
//        System.out.println(tp);

//        System.out.println(tp.pollLastEntry());
        System.out.println(tp.size());
        System.out.println(tp.subMap("aa","bb"));



    }
}
