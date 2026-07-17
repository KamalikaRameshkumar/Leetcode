-- Last updated: 7/17/2026, 2:59:58 PM
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
