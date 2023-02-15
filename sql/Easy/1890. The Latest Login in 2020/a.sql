SELECT
    user_id,
    max(time_stamp) AS last_stamp
FROM
    Logins
WHERE
    time_stamp BETWEEN '2020-01-01'
    AND '2020-12-31 23:59:59:999'
GROUP BY
    user_id