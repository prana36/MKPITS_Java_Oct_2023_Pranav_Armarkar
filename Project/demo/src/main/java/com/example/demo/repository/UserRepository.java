package com.example.demo.repository;

import com.example.demo.mysql.model.UserDbModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <UserDbModel, Integer> {
}
