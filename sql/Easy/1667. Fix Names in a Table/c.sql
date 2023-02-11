-- oracle
SELECT
	user_id,
	INITCAP(name) AS name
FROM
	Users
ORDER BY
	user_id