package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(10);
        h.add("deepak");
        h.add(20);
        h.add(300);
        h.add(null);
        h.add(null);
        System.out.println(h);
        Iterator it = h.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
