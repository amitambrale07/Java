/*

1. ArrayList is a class in Collections Framework which implements the List interface
2. ArrayList is used to store heterogenous data into it.
3. Unlike any array there is no size limitation for ArrayList i.e. it is resizable and growable
4. Elements are organized in a manner they are added. (Follows insertion order)
5. ArrayList can have duplicate elements in it. 
6. ArrayList is mutable.
7. ArrayList are not synchronized
8. Syntax : 

class ArrayList implements List
{
    // Constructors
    // methods
}

*/

import java.util.*;

class ArrayListX
{
    public static void main(String Args[])
    {
        ArrayList al1 = new ArrayList(2);  // We can also provide the size 

        al1.add(11);
        al1.add(21); // Size gets doubled when the capacity gets zero
        al1.add(31); 

        System.out.println(al1);

        ArrayList al2 = new ArrayList();

        al2.add(71);
        al2.addAll(al1);

        System.out.println(al2);

        // add(index, element) : Inserts element at given index & the element which was on its placed gets shifted further
        al1.add(2, 41);

        System.out.println(al1);

        // Returns the element placed at given index
        System.out.println(al1.get(2));

        // Replaces element of the given index with another element
        al1.set(2, 25);

        System.out.println(al1);

        // Removes element from given index
        al1.remove(2);

        System.out.println(al1);

        //Returns number of elements
        System.out.println(al1.size());

        // Checks if list is empty
        System.out.println(al1.isEmpty());

        // Removes all elements
        // al1.clear();

        // Checks if element exists
        System.out.println(al1.contains(11));	

        // indexOf() : Returns the index of specified element if present
        System.out.println(al1.indexOf(11));  // Placed at zeroth index
    }
}