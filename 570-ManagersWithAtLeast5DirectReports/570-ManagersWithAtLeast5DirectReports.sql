-- Last updated: 7/17/2026, 2:59:20 PM
# Write your MySQL query statement below
SELECT e.name
FROM Employee e
JOIN Employee emp
ON e.id = emp.managerId
GROUP BY e.id, e.name
HAVING COUNT(emp.id) >= 5;