SELECT
	u.user_id AS buyer_id,
	u.join_date,
	sum(IF(year(o.order_date) = '2019', 1, 0)) AS orders_in_2019
FROM
	Users AS u
	LEFT JOIN Orders AS o ON u.user_id = o.buyer_id
GROUP BY
	u.user_id