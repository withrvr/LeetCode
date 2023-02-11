-- short ... many things are working automatically her to no need to add i guess
-- GROUP_CONCAT sorts the column in asc order by default, when used with DISTICNT.
-- There's no need to use SEPARATOR in group_concat here. group_concat automatically does it for you :)
-- There is no need of 'ORDER BY product' since default is ASC
SELECT
	sell_date,
	count(DISTINCT product) AS num_sold,
	GROUP_CONCAT(DISTINCT product) AS products
FROM
	activities
GROUP BY
	sell_date