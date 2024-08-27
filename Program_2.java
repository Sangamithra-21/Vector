package Assignment_19_Vector;

import java.util.Vector;

public class Program_2 {
    public static void main(String[] args) {

        Vector<Double> s=new Vector<>();

        s.add(1.5);
        s.add(3.5);
        s.add(4.5);
        s.add(6.5);
        s.add(7.5);

        String res = s.contains(10.5) ? "Found" : "Not Found";
        System.out.println("10.5 is Found in Vector or Not : "+res);

        System.out.println("Size Before Adding Element : "+s.size());
        s.add(10.4);
        System.out.println("Size After Adding Element  : "+s.size());


    }
}
