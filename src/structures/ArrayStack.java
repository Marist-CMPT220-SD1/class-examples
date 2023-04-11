package structures;

public class ArrayStack<T> implements Stack<T> {
    private T[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    /**
     * Construct a stack with the default capacity 16
     */
    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Construct a stack with the specified capacity
     */
    public ArrayStack(int capacity) {
        elements = (T[]) new Object[capacity];
    }

    @Override
    public void push(T value) {
        if (size >= elements.length) {
            T[] temp = (T[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size] = value;
        size++;
    }

    @Override
    public T pop() {
        return elements[--size];
    }

    @Override
    public T peek() {
        return elements[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /** Test whether the stack is full (at capacity). */
    public boolean isFull() {
        return size == elements.length;
    }

    /**
     * Return the number of elements in the stack
     */
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> s = new ArrayStack<>(); // concrete classes can be instantiated

        s.push(Integer.valueOf(5)); // creates a new Integer object
        s.push(Integer.valueOf(2));
        s.push(Integer.valueOf(8));
        s.push(Integer.valueOf(15));

        System.out.println(s.isEmpty()); // should print `false`

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // should print each element from to top to bottom
            s.pop();
        }

        System.out.println(s.isEmpty()); // should print `true`
    }
}
