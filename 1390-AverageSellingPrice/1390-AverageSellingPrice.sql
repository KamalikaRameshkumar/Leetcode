-- Last updated: 7/17/2026, 2:58:19 PM
SELECT
    p.product_id,
    ROUND(
        IFNULL(SUM(u.units * p.price) / SUM(u.units), 0),
        2
    ) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;