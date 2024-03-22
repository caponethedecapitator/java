package CoreJava;

import java.util.*;
public class ArrayListTest 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> Mynumbers = new ArrayList<>();
        Mynumbers.ensureCapacity(100);
        Mynumbers.add(100);
        Mynumbers.add(3);
        Mynumbers.add(1);
        Mynumbers.add(4);
        Mynumbers.add(2);
        Mynumbers.add(10);
        Mynumbers.remove(0);
        System.out.println(Mynumbers.size());
        Collections.sort(Mynumbers);
        for (Integer a : Mynumbers)
        {
            System.out.println(a);
        }
        Mynumbers.set(4, 5);
        System.out.println(Mynumbers.get(4));
        System.out.println(Mynumbers.toArray());
    }
}
