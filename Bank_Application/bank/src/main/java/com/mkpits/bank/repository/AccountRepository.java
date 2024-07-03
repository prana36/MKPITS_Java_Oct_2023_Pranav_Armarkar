package com.mkpits.bank.repository;

import com.mkpits.bank.mysql.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account , Integer> {
    List<Account> findAccountsByUserId(Integer userId);
}
