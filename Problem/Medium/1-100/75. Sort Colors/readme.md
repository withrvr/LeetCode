# 75. Sort Colors

- Medium
- https://leetcode.com/problems/sort-colors/description/
- [4-Array in Love-Babbar-Final-450](https://docs.google.com/spreadsheets/d/1-tJhKLvCRnb4KHBgQsDFLWERWeFerVZQaVP1v12COuQ/edit)
- Done on : (6-Dec-2022)


# Solution

- [a.java](./a.java)
  - counting number of 0's, 1's, and 2's.
  - Overwrite array with the total number
  - of 0's, then 1's and followed by 2's.

- [b.java](./b.java)
  - swaping
  - while tracking the last positions of the 0, 2
  - and traversing using mid ... and sorting

- [c.java](./c.java)
  - see which number is it
  - then add one more to where it belongs // like insertion sort
  - and at one one element to other numbers also .. who are after it

