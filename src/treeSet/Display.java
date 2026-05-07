package treeSet;

import java.util.TreeSet;

public class Display {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
//        ts.add("ram");
//        ts.add("bbbb");
//        ts.add("cccc");
//        ts.add(10);
//        ts.add(2);
   //     ts.add(3);
        ts.add(true);
        ts.add(false);
        ts.add(true);
        ts.add(false);
        ts.remove(false);
//        ts.clear();
//        ts.add(null);
        System.out.println(ts);



    }
}
