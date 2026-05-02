package linkList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {

        LinkedList lll = new LinkedList();
        lll.add(101);
        lll.add("ram");
        lll.add('c');
        lll.addFirst(100);
        lll.addLast(104);

        System.out.println(lll);
        System.out.println(lll.getFirst());
        System.out.println(lll.getLast());



    }
}
