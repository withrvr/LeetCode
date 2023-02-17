SELECT
    t.email
FROM
    (
        SELECT
            email,
            count(*) AS total
        FROM
            Person
        GROUP BY
            email
    ) AS t
WHERE
    t.total > 1