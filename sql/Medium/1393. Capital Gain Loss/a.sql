SELECT
    buy.stock_name,
    (sell.price - buy.price) AS capital_gain_loss
FROM
    (
        SELECT
            stock_name,
            sum(price) AS price
        FROM
            Stocks
        WHERE
            operation = 'Buy'
        GROUP BY
            stock_name
    ) AS buy,
    (
        SELECT
            stock_name,
            sum(price) AS price
        FROM
            Stocks
        WHERE
            operation = 'Sell'
        GROUP BY
            stock_name
    ) AS sell
WHERE
    buy.stock_name = sell.stock_name