SELECT
	event_day AS "day",
	emp_id,
	sum(out_time) - sum(in_time) AS "total_time"
FROM
	Employees
GROUP BY
	event_day,
	emp_id