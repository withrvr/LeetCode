-- my sql server
SELECT
	product_id,
	store,
	price
FROM
	Products UNPIVOT (
		price FOR store IN (store1, store2, store3)
	) AS T