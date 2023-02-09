-- m% vs M% ... are same
SELECT
    employee_id,
    -- if even / start m => salaray 0
    IF employee_id % 2 = 0
    OR name LIKE 'm%',
    0,
    salary AS bonus
FROM
    Employees
ORDER BY
    employee_id