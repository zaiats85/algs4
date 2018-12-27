import edu.princeton.cs.algs4.*;

/***************************************************************************
 * Test routine.
 ***************************************************************************/

/**
 * Unit tests the {@code SequentialSearchST} data type.
 *
 * @param args the command-line arguments
 */

public class TestSequentialSearchLinkedListST {

    public static void main(String[] args) {
        SequentialSearchST<String, Integer> st = new SequentialSearchST<String, Integer>();

        long insertStart = System.currentTimeMillis();
        for (int i = 0; !StdIn.isEmpty(); i++) {
            String key = StdIn.readString();
            st.put(key, i);
        }
        long insertEnd = System.currentTimeMillis();
        StdOut.println("Insert " + (insertStart - insertEnd) + " milliseconds\n");

        long searchStart = System.nanoTime();
        st.get("is");
        long searchEnd = System.nanoTime();
        StdOut.println("Search existing key " + (searchStart - searchEnd) + " nanoseconds\n");

        long UnexStart = System.nanoTime();
        st.get("іваі");
        long UnexEnd = System.nanoTime();
        StdOut.println("Search non-existing key " + (UnexStart - UnexEnd) + " nanoseconds\n");

    }

}
