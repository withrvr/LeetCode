SELECT
    activity_date AS DAY,
    count(DISTINCT user_id) AS active_users
FROM
    Activity
GROUP BY
    activity_date
HAVING
    activity_date BETWEEN '2019-06-28'
    AND '2019-07-27'