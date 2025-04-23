package queue;

import java.util.Stack;

public class QueueUsingStack {
	// this is the main stack which we will use as queue
    Stack<Integer> queueStack = new Stack<>();
    // rev stack
    Stack<Integer> revStack = new Stack<>();

    public void push(int x) {
        if (this.queueStack.size() == 0) {
            this.queueStack.push(x);
        } else {
            while (this.queueStack.size() != 0) {
                this.revStack.push(this.queueStack.pop());
            }
            this.revStack.push(x);
            while (this.revStack.size() != 0) {
                this.queueStack.push(this.revStack.pop());
            }
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public Integer pop() {
        if (this.queueStack.size() > 0) {
            return this.queueStack.pop();
        } else {
            return null;
        }

    }

    /**
     * Get the front element.
     */
    public Integer peek() {
        if (this.queueStack.size() > 0) {
            return this.queueStack.get(this.queueStack.size() - 1);
        } else {
            return null;
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return this.queueStack.size() == 0;
    }
}
