-- 💀: incorrect
SELECT
	activity_date AS DAY,
	COUNT(DISTINCT user_id) AS active_users
FROM
	Activity
WHERE
	datediff('2019-7-27', activity_date) < 30
GROUP BY
	activity_date;