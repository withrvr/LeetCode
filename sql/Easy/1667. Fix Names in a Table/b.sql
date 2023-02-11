-- LOWER(RIGHT(name, 1))
-- this dont work
-- will get the right most char
SELECT
	user_id,
	CONCAT(
		UPPER(LEFT(name, 1)),
		LOWER(RIGHT(name, 1))
	) AS name
FROM
	Users
ORDER BY
	user_id