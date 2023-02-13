-- if only
-- 1 row
-- dont WORK
SELECT
	DISTINCT Salary AS SecondHighestSalary
FROM
	Employee
ORDER BY
	Salary DESC
LIMIT
	1 OFFSET 1