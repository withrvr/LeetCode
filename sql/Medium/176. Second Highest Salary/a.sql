SELECT
    max(salary) AS SecondHighestSalary
FROM
    Employee
WHERE
    -- !=
    Salary <> (
        SELECT
            max(salary)
        FROM
            Employee
    )