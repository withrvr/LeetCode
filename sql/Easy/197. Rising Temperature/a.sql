-- a.recordDate + 1 = b.recordDate
-- this dont work
-- use date diff ... to find the diff
SELECT
    a.id
FROM
    Weather AS a,
    Weather AS b
WHERE
    DATEDIFF(b.recordDate, a.recordDate) = 1
    AND b.temperature > a.temperature