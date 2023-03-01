// [8, 7, 4, 1, 2]
// [4, 2, 1, 1]
// [2, 1, 1]
// [1, 1]
// []

// [8, 7, 4, 1, 2, 1]
// [4, 2, 1, 1, 1]
// [2, 1, 1, 1]
// [1, 1, 1]
// [1]

// To Code : 30 min
// Execution : 1 ms

// Time complexity: O(n + n * (3*log(n))) --> O(nlogn)
// Space complexity: O(n)

// import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>((a, b) -> b - a);

        for (int stone : stones)
            max_heap.add(stone);

        System.out.println(max_heap.toString());

        while (max_heap.size() > 1) {
            int y = max_heap.poll();
            int x = max_heap.poll();

            // int diff = y - x;

            // if (diff != 0)
            // max_heap.add(diff);

            if (y > x)
                max_heap.add(y - x);

            System.out.println(max_heap.toString());
        }

        int size = max_heap.size();
        return size == 0 ? 0 : max_heap.poll();

        // Integer res = max_heap.poll();
        // return res == null ? 0 : res;
    }
}
