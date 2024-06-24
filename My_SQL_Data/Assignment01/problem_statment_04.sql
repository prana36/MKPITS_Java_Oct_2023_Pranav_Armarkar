#4. **Display all actors whose last name starts with 'A' and order by first name:**
use sakila;
SELECT first_name, last_name
FROM actor
WHERE last_name LIKE 'A%'
ORDER BY first_name;