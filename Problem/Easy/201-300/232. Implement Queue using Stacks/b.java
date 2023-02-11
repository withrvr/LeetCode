// using deque ... as stack

import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {
	private Deque<Integer> in_stk = new ArrayDeque<>();
	private Deque<Integer> out_stk = new ArrayDeque<>();

	// Push element x to the back of queue...
	public void push(int x) {
		in_stk.push(x);
	}

	// Remove the element from the front of the queue and returns it...
	public int pop() {
		peek();
		return out_stk.pop();
	}

	// Get the front element...
	public int peek() {
		if (out_stk.isEmpty())
			while (!in_stk.isEmpty())
				out_stk.push(in_stk.pop());
		return out_stk.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return in_stk.isEmpty() && out_stk.isEmpty();
	}
}
