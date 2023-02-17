WITH tmp AS(
	SELECT
		t.account,
		u.name,
		sum(amount) AS balance
	FROM
		Transactions t
		LEFT JOIN Users u ON t.account = u.account
	GROUP BY
		account
)
SELECT
	name,
	balance
FROM
	tmp
WHERE
	balance > 10000