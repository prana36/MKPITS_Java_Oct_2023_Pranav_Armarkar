package com.mkpits.bank.repository;

import com.mkpits.bank.mysql.model.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialRepository extends JpaRepository<UserCredential ,Integer> {
}
