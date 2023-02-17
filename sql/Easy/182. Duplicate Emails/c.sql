WITH temp AS (
	SELECT
		email,
		row_number() over(PARTITION by email) AS rnk
	FROM
		person
)
SELECT
	DISTINCT email
FROM
	temp
WHERE
	rnk > 1