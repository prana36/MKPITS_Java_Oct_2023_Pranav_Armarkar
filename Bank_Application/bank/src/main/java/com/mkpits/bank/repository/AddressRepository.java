package com.mkpits.bank.repository;

import com.mkpits.bank.mysql.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer > {
}
