/*

**LinkedList**

1. LinkedList is a class which implements the List interface & is present in the java.util package.
2. Syntax : 
    class LinkedList implements List, Deque
3. LinkedList uses the datastructures likes Doubly Linked list or Circular Linked List

       +-------+-----+-------+ ↔ +-------+-----+-------+ ↔ +-------+-----+-------+ ↔ +-------+-----+-------+ 
       | NULL  | 11  | 1001  |   | 1000  | 21  | 1002  |   | 1001  | 41  | 1003  |   | 1002  | 51  | NULL  |
       +-------+-----+-------+   +-------+-----+-------+   +-------+-----+-------+   +-------+-----+-------+
       1000                       1001                      1002                      1003

4. Advantages of LinkedList
• Efficient for performing insertion and deletion operations between two nodes as compared to 
  array (Array requires shifting of elements for adding or deleting element in between) 
  e.g 
       +-------+-----+-------+ ↔ +-------+-----+-------+  +-------+-----+-------+ ↔ +-------+-----+-------+ 
       | NULL  | 11  | 1001  |   | 1000  | 21  | 3000  |   | 3000 | 41  | 1003  |   | 1002  | 51  | NULL  |
       +-------+-----+-------+   +-------+-----+-------+   +-------+-----+-------+   +-------+-----+-------+
       1000                       1001              |      1002   ^                   1003
                                                    V             |
                                                +-------+-----+-------+
                                                | 1001  | 11  | 1002  | (Insert at thrid psoition)
                                                +-------+-----+-------+
                                                3000

•  We can traverse the list in forawrd and backward direction both.

5. Disadvantges : 
• Requires extra memory for storing address of previous and next nodes.
• In case of insertion & deletion we need to manage the previous and next node.

6. LL is a index based ds
7. Can store duplicate elements
8. Can store diuplicate elements
9. Can store multipe null values
10. Follows in insertion order
11. Does not folow the sorting order.
12. non synchronized

interface Collection
{

    boolean add(Object obj); 
    
    boolean addAll(Collection c);

    boolean remove(Object obj); 
    
    boolean removeAll(Collection c);

    void clear();

    boolean contains (Object obj);

    boolean containsAll (Collection c);

    boolean isEmpty();

    int size();

    Iterator iterator();

    ---etc
}

interface List extends Collection
{

    //contains Collection interface methods

    void add(int index, Object obj); 
    
    void addAll(int index, Collection c);

    Object get(int index);

    Object remove(int index);

    Object set(int index, Object newobj);

    int indexOf(Object obj);

    int lastIndexOf(Object obj);

    ---etc
}

class LinkedList implements List, Deque
{

    // contains Collection, List and Deque methods

    void addFirst(Object obj);

    void addLast(Object obj);

    Object getFirst();

    Object getLast();

    Object removeFirst();

    Object removeLast();

    ---etc
}

*/

import java.util.*;


class LL
{
    public LinkedList l = new LinkedList();

    public void ForEach()
    {
        // For each loop
        System.out.println("Using for each loop ");

        for(Object obj : l)
        {
            System.out.print(obj + " ");
        }

        System.out.println("\n");
    }

    public void IteratorX()
    {
        // Using iterator cursor
        System.out.println("Using Iterator");

        Iterator it = l.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n");
    }

    public void ListIteratorX()
    {
        // Forward
        System.out.println("Using ListIterator : forward");

        ListIterator it = l.listIterator();

        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n");

        // Backward
        System.out.println("Using ListIterator : backward");

        while(it.hasPrevious())
        {
            System.out.print(it.previous() + " ");
        }

        System.out.println("\n");
    }

    public void insertX()
    {
        // add
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);

        // addAll
        // l.addAll(); 

        // set : Replaces the element stored at that index 
        l.set(3, 13.5);

        // addFirst() : Adds the object at the first posistion
        l.addFirst(01);

        // addLast() : Adds the object at the last position
        l.addLast(14);

    }

    public void deleteX()
    {
        // remove : Deletes the element at given index value
        l.remove(2);

        // l.remove(11); 

        // l.clear();

        // l.removeFirst();

        // l.removeLast();
    }

    public void Access()
    {
        System.out.println("get(int index) : " + l.get(3));

        System.out.println("getFirst() : " + l.getFirst());

        System.out.println("getLast() : " + l.getLast());

        System.out.println("indexOf(Object o) : " + l.indexOf(14));

        System.out.println("lastIndexOf(Object o) : " + l.lastIndexOf(12));

        System.out.println("size : " + l.size());
    }

    public void FilterX()
    {
        System.out.println("contains(Object o) : "+ l.contains(14));

        System.out.println("isEmpty() : " + l.isEmpty());
    }
}

class LinkedListX 
{
    public static void main(String Args[])
    {
        LL lobj = new LL();

        lobj.insertX();
        System.out.println("Elements inserted successfully\n");

        // lobj.ForEach();

        // lobj.IteratorX();

        lobj.ListIteratorX();

        lobj.deleteX();
        System.out.println("Elements removed successfully\n");

        lobj.ListIteratorX();

        lobj.Access();
        System.out.println("Elements accessed successfully\n");
        
        lobj.FilterX();
        System.out.println("\nElements filtered successfully\n");

    }
}