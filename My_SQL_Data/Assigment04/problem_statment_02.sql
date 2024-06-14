#2.	Display the rental date and return date for each rental along with the customer's first name and last name.
use sakila;
select rental.rental_date ,rental.return_date, customer.first_name, customer.last_name 
from rental join customer on rental.rental_id = customer.customer_id;