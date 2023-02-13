(
	SELECT
		E.employee_id
	FROM
		Employees E
		LEFT JOIN Salaries S ON E.employee_id = S.employee_id
	WHERE
		S.salary IS NULL
	UNION
	SELECT
		S.employee_id
	FROM
		Employees E
		RIGHT JOIN Salaries S ON E.employee_id = S.employee_id
	WHERE
		E.name IS NULL
)
ORDER BY
	employee_id