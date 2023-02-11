# 📄: 303. Range Sum Query - Immutable

- https://leetcode.com/study-plan/programming-skills/?progress=x824bvmv

# ✅: Solution

- a ... brute force ... calculating sum from left to right on time
- b ... **fastest logic**
  - storing sum till that index (means sum from 0 to current index)
- c ... extra ... num[0]=0 ... then solving
  - _c .... using accumulate