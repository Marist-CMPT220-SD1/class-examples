package structures;

// T is a "type parameter"
// it's a placeholder for whatever data type (class or interface)
// we choose to place in the queue
public class ArrayQueue<T> implements Queue<T> {
    private static final int DEFAULT_CAPACITY = 16;
    private final T[] elements; // fixed-size container for elements
    private int head; // points to the front element
    private int tail; // points one-beyond the back element

    /**
     * Construct a stack with the default capacity 16
     */
    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Construct a stack with the specified capacity
     */
    public ArrayQueue(int capacity) {
        elements = (T[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        if (head == 0)
            return tail == elements.length - 1;
        return tail + 1 == head; // when tail immediately precedes head
    }

    public T front() /*throws Exception*/ {
        if (isEmpty())
            return null;
            //throw new Exception("Empty queue has no front element");
        return elements[head];
    }

    public T back() /*throws Exception*/ {
        if (isEmpty())
            return null;
            //throw new Exception("Empty queue has no front element");
        if (tail == 0)
            return elements[elements.length - 1];
        return elements[tail - 1];
    }

    @Override
    public boolean enqueue(T value) /*throws Exception*/ {
        if (isFull())
            return false;
            //throw new Exception("Cannot enqueue on a full queue");
        elements[tail] = value;
        tail++;
        if (tail == elements.length)
            tail = 0;
        return true;
    }

    public T dequeue() /*throws Exception*/ {
        if (isEmpty())
            return null;
            //throw new Exception("Cannot dequeue from an empty queue");
        T data = front();
        if (head == elements.length - 1)
            head = 0;
        else
            head++;
        return data;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> s = new ArrayQueue<>(); // concrete classes can be instantiated

        s.enqueue(5); // creates a new Integer object
        s.enqueue(2);
        s.enqueue(8);
        s.enqueue(15);

        System.out.println(s.isEmpty()); // should print `false`

        while (!s.isEmpty()) {
            System.out.println(s.front()); // should print each element from to top to bottom
            s.dequeue();
        }

        System.out.println(s.isEmpty()); // should print `true`
    }
}
