SELECT
	product_id
FROM
	products
WHERE
	'N' NOT IN (low_fats, recyclable)