-- Last updated: 7/17/2026, 2:58:37 PM
SELECT 
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;