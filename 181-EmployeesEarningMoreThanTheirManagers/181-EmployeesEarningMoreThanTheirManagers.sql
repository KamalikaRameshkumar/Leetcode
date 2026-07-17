-- Last updated: 7/17/2026, 2:59:59 PM
SELECT
    e.name AS Employee
FROM Employee e
JOIN Employee m
    ON e.managerId = m.id
WHERE e.salary > m.salary;