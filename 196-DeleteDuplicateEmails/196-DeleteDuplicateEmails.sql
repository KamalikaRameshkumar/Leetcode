-- Last updated: 7/17/2026, 2:59:51 PM
DELETE p1
FROM Person p1
JOIN Person p2
    ON p1.email = p2.email
   AND p1.id > p2.id;