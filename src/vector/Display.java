package vector;

import java.util.Vector;

public class Display {
    public static void main(String[] args) {

        Vector v = new Vector();//capacity 10
        v.add(100);
        v.add(100);
        v.add(100);
        v.add(100);
        v.add(100);
        v.addElement("aaaaa");
        v.add('d');
        v.add(100);
        v.add(100);
        v.add(100);
        v.add(100);
        v.add(100);
        v.add(100);
//        System.out.println(v.capacity());
        System.out.println(v);

    }
}
