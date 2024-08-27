package Assignment_19_Vector;

import java.util.Iterator;
import java.util.Vector;

public class Program_1 {
    public static void main(String[] args) {

        Vector<Integer> a=new Vector<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println("Second Index (Third Element) :" +a.get(2));

        Iterator<Integer> iterator = a.iterator();
        System.out.println("Vector Elements");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
    }
}
