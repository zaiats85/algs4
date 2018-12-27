/******************************************************************************
 *  Compilation:  javac ArrayST.java
 *  Execution:    java ArrayST < input.txt
 *  Dependencies: StdIn.java StdOut.java
 *  Data files:   https://algs4.cs.princeton.edu/31elementary/tinyST.txt
 *
 *
 *  Symbol table implementation with unordered array. Uses repeated
 *  doubling to resize the array.
 *
 *  % java ArrayST < tiny.txt
 *  S 0
 *  H 5
 *  X 7
 *  R 3
 *  C 4
 *  L 11
 *  A 8
 *  M 9
 *  P 10
 *  E 12
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.*;

/***************************************************************************
 * Test routine.
 ***************************************************************************/

public class TestArrayST {
    public static void main(String[] args) {
        ArrayST<String, Integer> st = new ArrayST<String, Integer>();

        long insertStart = System.currentTimeMillis();
        for (int i = 0; !StdIn.isEmpty(); i++) {
            String key = StdIn.readString();
            /*StdOut.println(key);*/
            st.put(key, i);
        }
        long insertEnd = System.currentTimeMillis();
        StdOut.println("Insert " + (insertStart - insertEnd) + " milliseconds\n");

        long searchStart = System.nanoTime();
        st.get("is");
        long searchEnd = System.nanoTime();
        StdOut.println("Search existing key " + (searchStart - searchEnd) + " nanoseconds\n");

        long UnexStart = System.nanoTime();
        st.get("мудак");
        long UnexEnd = System.nanoTime();
        StdOut.println("Search non-existing key " + (UnexStart - UnexEnd) + " nanoseconds\n");

    }
}
