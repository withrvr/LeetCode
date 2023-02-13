-- https://leetcode.com/problems/rising-temperature/solutions/55619/simple-solution/
SELECT
	a.Id
FROM
	Weather a,
	Weather b
WHERE
	a.temperature > b.temperature
	AND TO_DAYS(a.recordDate) - TO_DAYS(b.recordDate) = 1;