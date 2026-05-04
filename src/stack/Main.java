package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.add(101);
        s.push(102);
        s.add(103);
        s.add("raj");
//        System.out.println(s);
//        s.pop();
//        System.out.println(s);
//        System.out.println(s.peek());
        System.out.println(s.search(103));
        System.out.println(s.search(s));
        System.out.println(s.empty());
    }
}
