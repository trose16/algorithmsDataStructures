package linkedList;
/******************************************************************************
 *  Compilation:  javac Linkedlist.java
 *  Execution:    java Linkedlist < input.txt
 *  Dependencies: StdIn.java StdOut.java
 *  Data files:   http://algs4.cs.princeton.edu/13stacks/tobe.txt  
 *
 *  A generic list, implemented using a singly-linked list.
 *
 *  % java list < tobe.txt 
 *  to be or not to be (2 left on list)
 *
 ******************************************************************************/


import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdOut;

/**
 *  The {@code Linkedlist} class represents a linked list based on Linked Queue from Robert Sedgewick and Kevin Wayne.
 */
public class MyLinkedList<Item> implements Iterable<Item> {
    private int n;         // number of elements on list
    private Node first;    // beginning of list
    private Node last;     // end of list

    // helper linked list class
    private class Node {
        private Item item;
        private Node next;
    }

    /**
     * Initializes an empty list.
     */
    public MyLinkedList() {
        first = null;
        last  = null;
        n = 0;
        assert check();
    }

    /**
     * Is this list empty?
     * @return true if this list is empty; false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this list.
     * @return the number of items in this list
     */
    public int size() {
        return n;     
    }

  
    /**
     * Adds the item to this list.
     * @param item the item to add
     */
    public void append(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        n++;
        assert check();
    }
    
    /**
     * Inserts item on specified index
     * Throws IllegalArgumentException if an invalid index is passed.
     * 
     * CAVEAT: random access in a linked list is O(N)
     * @param item
     * @param index
     */
    public void add(Item item, int index){
    	if(index < 0 || index > n-1)
    		throw new IllegalArgumentException("index needs to be in [0, index]");
    	
    	Node current = first;
    	for(int i = 0; i < index-1; i++){
    		current = current.next;		
    	}  	
		Node newNode = new Node();
		newNode.item = item;
		newNode.next = current.next;
		
		current.next = newNode;
		//assert check();
    }

    /**
     * Removes and returns the item on this list that was least recently added.
     * @return the item on this list that was least recently added
     * @throws java.util.NoSuchElementException if this list is empty
     */
    public Item removeFirstElement() {
        if (isEmpty()) throw new NoSuchElementException("list underflow");
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;   // to avoid loitering
        assert check();
        return item;
    }

    /**
     * Returns a string representation of this list.
     * @return the sequence of items in FIFO order, separated by spaces
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this)
            s.append(item + " ");
        return s.toString();
    } 

    // check internal invariants
    private boolean check() {
        if (n < 0) {
            return false;
        }
        else if (n == 0) {
            if (first != null) return false;
            if (last  != null) return false;
        }
        else if (n == 1) {
            if (first == null || last == null) return false;
            if (first != last)                 return false;
            if (first.next != null)            return false;
        }
        else {
            if (first == null || last == null) return false;
            if (first == last)      return false;
            if (first.next == null) return false;
            if (last.next  != null) return false;

            // check internal consistency of instance variable n
            int numberOfNodes = 0;
            for (Node x = first; x != null && numberOfNodes <= n; x = x.next) {
                numberOfNodes++;
            }
            if (numberOfNodes != n) return false;

            // check internal consistency of instance variable last
            Node lastNode = first;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            if (last != lastNode) return false;
        }

        return true;
    } 
 

    /**
     * Returns an iterator that iterates over the items in this list in FIFO order.
     * @return an iterator that iterates over the items in this list in FIFO order
     */
    public Iterator<Item> iterator()  {
        return new ListIterator();  
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }


    /**
     * Unit tests the {@code Linkedlist} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
    	String[] items = {"a", "b", "c", "d"};
        MyLinkedList<String> list = new MyLinkedList<String>();
        
        for(String item : items) {
            if (!item.equals("-"))
                list.append(item);
            else if (!list.isEmpty())
                StdOut.print(list.removeFirstElement() + " ");
        }
       
        StdOut.println("(" + list.size() + " left on list)");
        StdOut.println(list);
    }
}

/******************************************************************************
 *  Copyright 2002-2016, Robert Sedgewick and Kevin Wayne.
 *
 *  This file is part of algs4.jar, which accompanies the textbook
 *
 *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *      http://algs4.cs.princeton.edu
 *
 *
 *  algs4.jar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  algs4.jar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
 ******************************************************************************/
