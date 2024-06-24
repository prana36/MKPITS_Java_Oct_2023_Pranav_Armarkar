package com.mkpits.bank.repository;

import com.mkpits.bank.mysql.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer>{
}
