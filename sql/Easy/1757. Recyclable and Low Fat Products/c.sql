SELECT
	product_id
FROM
	Products
WHERE
	low_fats LIKE 'Y%'
	AND recyclable LIKE '%Y';

-- '%Y', 'Y%',