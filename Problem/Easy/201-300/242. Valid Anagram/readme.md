# 📄: 242. Valid Anagram

- Easy
- [LeetCode_Link](https://leetcode.com/problems/valid-anagram/)
- Done on : (27-dec-2022)

# ✅: Solution

- a.java ... sort --> if same
- b.java ... hash map --> no of occurrence
- c.java ... add/sub ... occurrence .... (if !=0)
- d.java ... add/sub ... occurrence .... (if !=0) ... using Hashmap
-
- e.java ... is **best** for this particular question
-
- Logic / Explained in individual file
-
- use at starting of code .... for/if diff len string
  -  V. IMP
  - else logic will not work properly
  ```java
  if (s.length() != t.length())
    return false;
  ```
