import java.util.*;

class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    private void transfer() {
        if (output.isEmpty()) {
            while (!input.isEmpty())
                output.push(input.pop());
        }
    }

    public int pop() {
        transfer();
        return output.pop();
    }

    public int peek() {
        transfer();
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}
