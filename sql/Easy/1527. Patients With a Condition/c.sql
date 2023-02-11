-- \\b .... measn non word character
-- ex: '', space, tab, new_line, etc
SELECT
	*
FROM
	patients
WHERE
	REGEXP_LIKE(conditions, '\\bDIAB1')