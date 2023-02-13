SELECT
	employee_id
FROM
	employees e FULL
	OUTER JOIN salaries s USING (employee_id)
WHERE
	e.name IS NULL
	OR s.salary IS NULL
ORDER BY
	employee_id;