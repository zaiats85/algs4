/******************************************************************************
 *  Compilation:  javac BST.java
 *  Execution:    java BST
 *  Dependencies: StdIn.java StdOut.java Queue.java
 *  Data files:   https://algs4.cs.princeton.edu/32bst/tinyST.txt
 *
 *  A symbol table implemented with a binary search tree.
 *
 *  % more tinyST.txt
 *  S E A R C H E X A M P L E
 *
 *  % java BST < tinyST.txt
 *  A 8
 *  C 4
 *  E 12
 *  H 5
 *  L 11
 *  M 9
 *  P 10
 *  R 3
 *  S 0
 *  X 7
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.*;

/***************************************************************************
 * Test routine.
 ***************************************************************************/

/**
 * Unit tests the {@code BST} data type.
 *
 * @param args the command-line arguments
 */

public class TestBinarySearchTreeST {

    public static void main(String[] args) {

        BST<String, Integer> st = new BST<String, Integer>();

        long insertStart = System.currentTimeMillis();
        for (int i = 0; !StdIn.isEmpty(); i++) {
            String key = StdIn.readString();
            if ((st.size() > 1) && (st.floor(key) != st.floor2(key)))
                throw new RuntimeException("floor() function inconsistent");
            st.put(key, i);
        }
        long insertEnd = System.currentTimeMillis();
        StdOut.println("Insert " + (insertStart - insertEnd) + " milliseconds\n");

        long searchStart = System.nanoTime();
        st.get("i");
        long searchEnd = System.nanoTime();
        StdOut.println("Search existing key " + (searchStart - searchEnd) + " nanoseconds\n");

        long UnexStart = System.nanoTime();
        st.get("morfius");
        long UnexEnd = System.nanoTime();
        StdOut.println("Search non-existing key is" + (UnexStart - UnexEnd) + " nanoseconds\n");

    }
}
