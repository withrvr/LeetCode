-- # (
SELECT
    product_id,
    lower('store1') AS store,
    store1 AS price
FROM
    Products
WHERE
    store1 IS NOT NULL
UNION
SELECT
    product_id,
    lower('store2') AS store,
    store2 AS price
FROM
    Products
WHERE
    store2 IS NOT NULL
UNION
SELECT
    product_id,
    lower('store3') AS store,
    store3 AS price
FROM
    Products
WHERE
    store3 IS NOT NULL -- # )
    -- # ORDER BY
    -- #     product_id, store