# 350. Intersection of Two Arrays II

- Easy
- [LeetCode_Link](https://leetcode.com/problems/intersection-of-two-arrays-ii/)
- Done on : (25-Dec-2022)
-
- all most same as / related to ... [6-Array ... in sheet](https://docs.google.com/spreadsheets/d/1-tJhKLvCRnb4KHBgQsDFLWERWeFerVZQaVP1v12COuQ/edit)
  - solution here ==> [DSA-Final-450-Sheet by Love Babber](https://github.com/withrvr/DSA-Final-450-Sheet)

# Solution

- [a.py](./a.py)
  - python one line
-
- [a.java](./a.java)
  - sets
  -
  - make arr1 as set1
  - check which arr2 element in set1
  - ie. element which is common
  -
  - NOTE: remove that ele from set1
  - because if arr2 contain more same ele
  - it will count it again ... but the intersection has been noted

- [b.java](./b.java)
  - sets
  - build it method for intersection ... retainAll

