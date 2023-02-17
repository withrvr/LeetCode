SELECT
	email
FROM
	person
GROUP BY
	email
HAVING
	count(*) > 1