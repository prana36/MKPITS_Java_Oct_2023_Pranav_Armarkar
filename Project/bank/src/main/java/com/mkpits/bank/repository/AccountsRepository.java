package com.mkpits.bank.repository;

import com.mkpits.bank.mysql.model.AccountModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountsRepository extends CrudRepository<AccountModel ,Integer> {
    Optional<AccountModel> findByUserId(Integer accountId);

}
