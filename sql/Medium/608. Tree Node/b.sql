SELECT
	id,
	IF(
		ISNULL(p_id),
		'Root',
		IF(
			id IN (
				SELECT
					p_id
				FROM
					tree
			),
			'Inner',
			'Leaf'
		)
	) TYPE
FROM
	tree