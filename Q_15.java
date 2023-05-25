Write a Java Program to iterate ArrayList using for-loop, iterator, and advance for-loop. Insert 3 Array List.Input 20 30 40Output:


iterator Loop:
20
30
40
Advanced For Loop:
20
30
40
For Loop:
20
30
40
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Insert elements into the ArrayList
        list.add(20);
        list.add(30);
        list.add(40);

        // Iterate over the ArrayList using a for-loop
        System.out.println("Using for-loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Iterate over the ArrayList using an iterator
        System.out.println("Using iterator:");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Iterate over the ArrayList using an enhanced for-loop
        System.out.println("Using enhanced for-loop:");
        for (int num : list) {
            System.out.println(num);
        }
    }
}

