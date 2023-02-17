SELECT
	name,
	sum(amount) balance
FROM
	users
	JOIN transactions USING(account)
GROUP BY
	account
HAVING
	sum(amount) > 10000