--  https://leetcode.com/problems/find-customer-referee/solutions/2398637/simple-query-with-easy-null-handling-using-coalesce/
SELECT
	name
FROM
	Customer
WHERE
	COALESCE(referee_id, 0) <> 2;