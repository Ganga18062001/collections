package listPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListCursor {
    public static void main(String[] args) {
        //list follow insertion order
        List li = new ArrayList();
        li.add(10);
        li.add(100);
        li.add(200);
        li.add(2);
        li.add(400);
        li.add(300);
        li.add(null);
        li.add(null);
//        System.out.println(li);
//        Iterator i = li.iterator();
//        while (i.hasNext()){
//            System.out.print(i.next()+" ");
//        }

        //using ListIterator

        ListIterator ll = li.listIterator();
        while (ll.hasNext()){
            System.out.print(ll.next()+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
        while (ll.hasPrevious()){
            System.out.print(ll.previous()+" ");

        }
        System.out.println();
//        li.add(20.2);
//        System.out.print(li+" ");
        System.out.println("----------------------------------");
       ll.set(50);


        System.out.println(li);

//        li.remove(0);
//        System.out.print(li+" ");

    }
}
