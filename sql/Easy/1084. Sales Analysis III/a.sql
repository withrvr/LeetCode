SELECT
    p.product_id,
    p.product_name
FROM
    Sales AS s
    LEFT JOIN Product AS p ON s.product_id = p.product_id
GROUP BY
    s.product_id
HAVING
    MIN(sale_date) >= CAST('2019-01-01' AS DATE)
    AND MAX(sale_date) <= CAST('2019-03-31' AS DATE)