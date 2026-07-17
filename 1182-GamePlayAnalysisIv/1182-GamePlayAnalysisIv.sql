-- Last updated: 7/17/2026, 2:58:36 PM
SELECT 
    ROUND(
        COUNT(DISTINCT a1.player_id) / COUNT(DISTINCT a0.player_id),
        2
    ) AS fraction
FROM Activity a0
LEFT JOIN Activity a1
    ON a0.player_id = a1.player_id
   AND DATEDIFF(a1.event_date, a0.event_date) = 1
WHERE (a0.player_id, a0.event_date) IN (
    SELECT player_id, MIN(event_date)
    FROM Activity
    GROUP BY player_id
);