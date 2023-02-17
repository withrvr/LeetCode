SELECT
	stock_name,
	sum(IF(operation = 'Buy', -1, 1) * price) AS capital_gain_loss
FROM
	stocks
GROUP BY
	stock_name