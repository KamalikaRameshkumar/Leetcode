-- Last updated: 7/17/2026, 3:00:05 PM
SELECT 
    (SELECT DISTINCT salary
     FROM Employee
     ORDER BY salary DESC
     LIMIT 1 OFFSET 1) AS SecondHighestSalary;