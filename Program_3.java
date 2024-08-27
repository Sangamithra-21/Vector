package Assignment_19_Vector;

import java.util.Arrays;
import java.util.Vector;

public class Program_3 {
    public static void main(String[] args) {

        Vector<String> str=new Vector<>();

        str.add("red");
        str.add("green");
        str.add("blue");
        str.add("yellow");

        System.out.println("Vector to Array ");
        String[] array = str.toArray(new String[0]);

        System.out.println(Arrays.toString(array));


        System.out.println("Array to Vector ");
        Vector<String> newVector = new Vector(Arrays.asList(array));

        System.out.println(newVector);

    }
}
