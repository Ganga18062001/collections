package map;

import java.util.HashMap;
import java.util.Map;

public class Prc {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(100,null);
        map.put(101,"aaa");
        map.put(104,'r');
        map.put(102,"bbb");
        map.put(null,"ccc");

//        map.clear();
//        System.out.println(map.getClass());

       // System.out.println(map.containsKey(102));
        //System.out.println(map.containsValue("cc"));

        System.out.println(map);
        System.out.println(map.remove(102));
        System.out.println(map);

    }
}
