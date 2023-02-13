-- https://leetcode.com/problems/tree-node/solutions/127645/tree-node/comments/216710
-- `not in` advance version
-- to work it
SELECT
	id,
	CASE
		WHEN p_id IS NULL THEN 'Root'
		WHEN id NOT IN (
			SELECT
				p_id
			FROM
				tree
			WHERE
				p_id IS NOT NULL
		) THEN 'Leaf'
		ELSE 'Inner'
	END AS TYPE
FROM
	tree