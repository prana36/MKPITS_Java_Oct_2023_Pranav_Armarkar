#1. Retrieve the names of all customers and the titles of the films they have rented.
use sakila;
select customer.first_name ,film.title from customer join film on customer.customer_id = film.film_id join rental on film.film_id =rental.rental_id ;