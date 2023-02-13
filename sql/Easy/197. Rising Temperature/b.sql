SELECT
	w2.id
FROM
	Weather w1,
	Weather w2
WHERE
	w2.temperature > w1.temperature
	AND subdate(w2.recordDate, 1) = w1.recordDate;