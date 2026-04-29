import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorCursor {
    public static void main(String[] args) {
        Vector v  = new Vector();
        v.add(100);
        v.add(200);
        v.add(300);
        System.out.print(v+" ");

        Enumeration e = v.elements();
        while(e.hasMoreElements()){

            System.out.println();

            System.out.print(e.nextElement()+" ");

        }
    }
}
