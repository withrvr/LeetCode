SELECT
    u.name,
    sum(t.amount) AS balance
FROM
    Transactions AS t
    LEFT JOIN Users AS u ON u.account = t.account
GROUP BY
    t.account
HAVING
    balance > 10000