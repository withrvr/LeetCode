-- credit
-- https://leetcode.com/problems/swap-salary/solutions/104713/accept-solution-with-xor/comments/107431
--
UPDATE
	salary
SET
	sex = char(ascii(sex) ^ 11);