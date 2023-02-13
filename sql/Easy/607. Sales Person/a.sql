-- sales_id who dont order from red
SELECT
    name
FROM
    SalesPerson
WHERE
    sales_id NOT IN (
        -- sales_id who orders from red
        SELECT
            sales_id
        FROM
            Orders
        WHERE
            -- com_id of red
            com_id = (
                SELECT
                    com_id
                FROM
                    Company
                WHERE
                    name = "RED"
            )
    )