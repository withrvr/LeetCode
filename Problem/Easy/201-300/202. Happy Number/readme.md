# 202. Happy Number

- Easy
- https://leetcode.com/problems/happy-number/
- [LeetCode 75 --> Level 2 --> Day 1 --> Problem 1](https://leetcode.com/study-plan/leetcode-75/)
- done on (3-Dec-2022)

# Solution

- use sets to find the duplicate ... instead of list/vector
-
- [a.cpp](./a.cpp)
  - using vector to store next numbers in new array to track the elements
  - using find() from algorithum lib
  - to finding if loop is forming
    - aka that number have come before or not
    - which will on somepoint if .... sum is not 1

- [b.cpp](./b.cpp)
  - using sets instead of vector
  - {{9.line }} ... while (num) // num > 0, num!=0
  - (more improved to check if num have become 0)


- c.java
  - slow/fast method
- _d.java .... **fastest/best logic**
  - https://leetcode.com/problems/happy-number/solutions/421162/happy-number/
  - Approach 3: Hardcoding the Only Cycle (Advanced)
  - in which it will eventually come
-