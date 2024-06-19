package com.mkpits.bank.repository;

import com.mkpits.bank.mysql.model.AccountModel;
import org.springframework.data.repository.CrudRepository;

public interface AccountsRepository extends CrudRepository<AccountModel ,Integer> {
}
