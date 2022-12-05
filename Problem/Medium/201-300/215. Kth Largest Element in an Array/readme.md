# 215. Kth Largest Element in an Array

- Medium
- https://leetcode.com/problems/kth-largest-element-in-an-array/
- [3-Array in Love-Babbar-Final-450](https://docs.google.com/spreadsheets/d/1-tJhKLvCRnb4KHBgQsDFLWERWeFerVZQaVP1v12COuQ/edit)

# Solution

- [a.java](./a.java)
  - sort is in ascending order
  - return from ending index
  - since smaller numbers are in starting
  - ie. (nums.length-k)

- [b.cpp](./b.cpp)
  - sort is in greater order
  - return from starting index
  - since greater numbers are in starting
  - ie. (k-1)
