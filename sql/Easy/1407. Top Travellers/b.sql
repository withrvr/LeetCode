SELECT
	name,
	sum(IF(distance IS NULL, 0, distance)) AS travelled_distance
FROM
	Users u
	LEFT JOIN Rides r ON u.id = r.user_id
GROUP BY
	r.user_id
ORDER BY
	travelled_distance DESC,
	u.name ASC