package structures;

public class LinkedStack<T> implements Stack<T> {

    /**
     * Inner class to hold the data of our stack.
     */
    private class Node {
        T data;
        Node next;
    }

    private Node top; // refers to the top node of the linked stack

    @Override
    public void push(T value) {
        // 1. Instantiate a new node
        // 2. Set new node's data to be value
        // 3. Set new node's next to point to the current top
        // 4. Set top to point to the new node
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = top;
        top = newNode;
    }

    @Override
    public T pop() {
        // check if top is null
        // if so, just return null
        // otherwise, top is not null, then...
        // save the data of the current top node
        // make top point to the next node after top
        // return the data of the previous top
        if (top == null) {
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    @Override
    public T peek() {
        if (top == null) {
            return null; // TODO throw exception instead
        }
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new LinkedStack<>(); // concrete classes can be instantiated

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
