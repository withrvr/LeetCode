// All the calls to `pop` and `peek` are valid.

// To Code : 30 min
// Execution : ? ms

// Time complexity: O(n + n)
// Space complexity: O(n)

import java.util.Stack;

class MyQueue {

	Stack<Integer> input = new Stack<>();
	Stack<Integer> output = new Stack<>();

	// add in input ... its push only
	public void push(int x) {
		input.push(x);
	}

	public int pop() {
		// so add element in output if not there ... in reverse order
		peek();

		return output.pop();
	}

	// first element
	// it take all elements from
	// input --> output
	// in reverse order
	// ie. its queue now

	public int peek() {
		// NOTE: only adding if output is empty ....
		// else no need ... logic will get fucked
		if (output.empty())
			while (!input.empty())
				output.push(input.pop());

		return output.peek();
	}

	// no one cares ... its just checking if both are empty
	public boolean empty() {
		return input.empty() && output.empty();
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
