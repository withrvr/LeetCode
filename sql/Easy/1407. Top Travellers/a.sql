SELECT
    u.name,
    sum(
        CASE
            WHEN u.id = r.user_id THEN distance
            ELSE 0
        END
    ) AS travelled_distance
FROM
    users u
    LEFT JOIN rides r ON u.id = r.user_id
GROUP BY
    u.id
ORDER BY
    travelled_distance DESC,
    u.name ASC