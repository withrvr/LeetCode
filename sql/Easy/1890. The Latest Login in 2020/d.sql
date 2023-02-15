SELECT
	user_id,
	max(time_stamp) 'last_stamp'
FROM
	logins
WHERE
	time_stamp LIKE '2020%'
GROUP BY
	user_id