# 📄: 141. Linked List Cycle

<!-- - (0_asdf) :- https://github.com/withrvr/DSA-Final-450-Sheet -->
<!-- - level 1 day 0:- https://leetcode.com/study-plan/leetcode-75/ -->
- https://neetcode.io/practice
- https://www.techinterviewhandbook.org/grind75?weeks=26&hours=40

# ✅: Solution

- a.java ... (different than any other logic ) / explain / understand / first logic
- b.java ... simple version ... without try catch ...
- c.java ... using head as slow
  - **best method**

- both are best logic
- different approach

# My article / solution on leetcode

- of this problem:- https://leetcode.com/problems/linked-list-cycle/solutions/3069795/0ms-only-yo-wtf-also-without-slow/
- similar:- https://leetcode.com/discuss/topic/3023792/slow-fast-method-time-on-space-o1-full-explanation-with-diagram-4ms-only/

# Interesting question asked by someone

```
- What about this input
- [1, 1, 1, 1] ... -1 ?????
- or
- [33, 33, 33, 33, 33] ... -1 ?????
```
- you are right ...
- but we are checking for `reference` aka ```fast == slow```
- not for value ```fast.val == slow.val```
- so code will work fine

