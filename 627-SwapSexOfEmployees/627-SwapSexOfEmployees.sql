-- Last updated: 7/17/2026, 2:58:56 PM
# Write your MySQL query statement below
UPDATE Salary
SET sex = CASE
            WHEN sex = 'm' THEN 'f'
            ELSE 'm'
          END;