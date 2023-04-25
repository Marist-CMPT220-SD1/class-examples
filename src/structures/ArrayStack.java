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
        if (isFull()) {
            T[] temp = (T[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size] = value;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty())
            return null; // TODO maybe throw exception instead
        return elements[--size];
    }

    @Override
    public T peek() {
        if (isEmpty())
            return null; // TODO maybe throw exception instead
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

        s.push(5); // creates a new Integer object
        s.push(2);
        s.push(8);
        s.push(15);

        System.out.println(s.isEmpty()); // should print `false`
        System.out.println(s.getSize()); // should print `4`

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // should print each element from to top to bottom
            s.pop();
        }

        System.out.println(s.isEmpty()); // should print `true`
    }
}
