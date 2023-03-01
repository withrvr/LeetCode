// a.java short version
// better version

// return peek
// no need of x y variable

// 1 ms

// [8, 7, 4, 1, 2]
// [4, 2, 1, 1]
// [2, 1, 1]
// [1, 1]
// [0]

// [8, 7, 4, 1, 2, 1]
// [4, 2, 1, 1, 1]
// [2, 1, 1, 1]
// [1, 1, 1]
// [1, 0]
// [1]

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int stone : stones)
			max_heap.add(stone);

		while (max_heap.size() != 1)
			max_heap.add(max_heap.poll() - max_heap.poll());

		return max_heap.peek();
	}
}
