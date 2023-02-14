-- 💀: incorrect
SELECT
	activity_date AS DAY,
	COUNT(DISTINCT user_id) AS active_users
FROM
	activity
GROUP BY
	activity_date
HAVING
	activity_date >= DATE_SUB('2019-07-27', INTERVAL 30 DAY)