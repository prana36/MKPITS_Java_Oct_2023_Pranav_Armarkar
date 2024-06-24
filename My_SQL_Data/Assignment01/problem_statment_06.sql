#6. **Find all customers whose first name is 'John' and sort by last name in descending order:**
use sakila;
select * from customer where first_name="john" order by last_name desc ;