SELECT
	employee_id,
	salary * (employee_id % 2) * (name NOT LIKE 'M%') AS bonus
FROM
	Employees
ORDER BY
	employee_id