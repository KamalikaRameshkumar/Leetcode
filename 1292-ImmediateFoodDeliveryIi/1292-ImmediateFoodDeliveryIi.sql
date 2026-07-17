-- Last updated: 7/17/2026, 2:58:26 PM
SELECT 
    ROUND(
        AVG(order_date = customer_pref_delivery_date) * 100,
        2
    ) AS immediate_percentage
FROM Delivery
WHERE (customer_id, order_date) IN (
    SELECT customer_id, MIN(order_date)
    FROM Delivery
    GROUP BY customer_id
);