package setPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setcursor {
    public static void main(String[] args) {
        //set can  ot be follow insertion order
        Set s = new HashSet();
        s.add(4);
        s.add(100);
        s.add(200);
        s.add(2);
        s.add(null);
        s.add(null);
        s.add(300);
        s.add(300);
        s.add(3);
        s.add(620);
        System.out.print(s+" ");
        System.out.println();

        //only use iterator
        Iterator itr = s.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}
