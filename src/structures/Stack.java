package structures;

// structures.Stack is a "generic" interface
// can contain elements of some type T
// that we can specify later
// Technically, we say that the interface
// is parameterized by type T
// T is a type parameter

/**
 * A simple LIFO (last-in, first out) data structure.
 * Operations on a stack take a constant amount of time, regardless of the
 * size of the stack. We say that these operations have O(1) running time.
 * @param <T> the type of elements stored in the stack
 */
public interface Stack<T> {
    /**
     * Push a new element to the top of the stack.
     * @param value a new element that will become the top of the stack
     */
    void push(T value);

    /**
     * Return and remove the top element from the stack.
     * @return the element that was previously top of the stack
     */
    T pop();

    /**
     * Return the top element from the stack
     */
    T peek();

    /**
     * Test whether the stack is empty
     */
    boolean isEmpty();
}
