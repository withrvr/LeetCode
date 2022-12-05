# 2091. Removing Minimum and Maximum From Array

- Medium
- https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
- [2-Array in Love-Babbar-Final-450](https://docs.google.com/spreadsheets/d/1-tJhKLvCRnb4KHBgQsDFLWERWeFerVZQaVP1v12COuQ/edit#gid=1773184282)

# Solution

- [a.java](./a.java)
  - solution which came in my mind first
  - without any reference
  - can use Math.max / Math.min
  - for more better coding style

- [b.java](./b.java)
    - both delete_from_left  (ie. through right_most_index)
    - both delete_from_right (ie. through left_most_index)
    - right and left together

- [c.java](./c.java)
  - same as b.java only
  - it make sure
  - if min_index > max_index (swap)
  - min_index content the left_most_index (save time n memory)

.