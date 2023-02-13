-- https://leetcode.com/problems/tree-node/solutions/127645/tree-node/comments/216710
-- this solution dont work
-- __a ... fix
-- dont work ??
SELECT
	id,
	CASE
		WHEN p_id IS NULL THEN 'Root'
		WHEN id NOT IN (
			SELECT
				p_id
			FROM
				tree
		) THEN 'Leaf'
		ELSE 'Inner'
	END AS TYPE
FROM
	tree