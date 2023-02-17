SELECT
	u.name,
	IFNULL(sum(r.distance), 0) AS travelled_distance
FROM
	users u
	LEFT JOIN rides r ON u.id = r.user_id
GROUP BY
	r.user_id
ORDER BY
	travelled_distance DESC,
	u.name ASC