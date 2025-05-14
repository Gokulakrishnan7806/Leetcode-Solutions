import java.util.Stack;

class MyQueue {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        first.push(x);
    }

    // Removes the element from in front of queue and returns that element.
    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }

    // Get the front element.
    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek(); // Use peek instead of pop

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peeked;
    }

    // Returns whether the queue is empty.
    public boolean empty() {
        return first.isEmpty();
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */