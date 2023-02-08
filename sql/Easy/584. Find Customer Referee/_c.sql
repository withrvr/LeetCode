-- https://leetcode.com/problems/find-customer-referee/solutions/103284/fast-solution-using-ifnull/
SELECT
	name
FROM
	customer
WHERE
	IFNULL(referee_id, 0) <> 2;