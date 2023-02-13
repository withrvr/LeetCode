-- https://leetcode.com/problems/tree-node/solutions/104112/solution-with-explanation-case-left-join/
-- not recomended
SELECT
	DISTINCT t1.id,
	(
		CASE
			WHEN t1.p_id IS NULL THEN 'Root'
			WHEN t1.p_id IS NOT NULL
			AND t2.id IS NOT NULL THEN 'Inner'
			WHEN t1.p_id IS NOT NULL
			AND t2.id IS NULL THEN 'Leaf'
		END
	) AS TYPE
FROM
	tree t1
	LEFT JOIN tree t2 ON t1.id = t2.p_id