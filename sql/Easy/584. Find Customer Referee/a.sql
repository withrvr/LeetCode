-- https://leetcode.com/problems/find-customer-referee/solutions/127733/find-customer-referee/
-- explained more properly here
--
-- null values .. will not come
-- also this is not working ??
--
-- referee_id != 2 or referee_id = null
-- referee_id NOT IN (2)
SELECT
    name
FROM
    Customer
WHERE
    referee_id != 2