package com.mkpits.bank.repository;

import com.mkpits.bank.mysql.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer > {
}
