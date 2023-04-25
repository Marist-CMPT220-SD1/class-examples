package structures;

// structures.Queue is a "generic" interface
// can contain elements of some type T
// that we can specify later
// Technically, we say that the interface
// is parameterized by type T
// T is a type parameter

/**
 * A simple FIFO (first-in, first out) data structure.
 * Operations on a queue take a constant amount of time, regardless of the
 * size of the queue. We say that these operations have O(1) running time.
 * @param <T> the type of elements stored in the queue
 */
public interface Queue<T> {
    /**
     * Push a new element on the back of the queue.
     *
     * @param value a new element that will become the back of the queue
     * @return true if the operation succeeded, false otherwise (e.g., queue full)
     */
    boolean enqueue(T value);

    /**
     * Return and remove the front element from the queue.
     * @return the element that was previously front of the queue
     */
    T dequeue();

    /**
     * Return the front element from the queue
     */
    T front();

    /**
     * Return the back element from the queue
     */
    T back();

    /**
     * Test whether the stack is empty
     */
    boolean isEmpty();
}
