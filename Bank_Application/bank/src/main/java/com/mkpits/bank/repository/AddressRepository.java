package com.mkpits.bank.repository;

import com.mkpits.bank.mysql.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer > {
//    AddressResponseDto getAddress(Integer user_id);
}
