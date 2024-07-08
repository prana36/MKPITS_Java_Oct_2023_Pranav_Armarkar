package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.response.AddressResponseDto;
import com.mkpits.bank.mysql.model.Address;
import com.mkpits.bank.repository.AddressRepository;

import com.mkpits.bank.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService implements IAddressService {
    @Autowired
    AddressRepository addressRepository;

    @Override
 public AddressResponseDto getAddress(Integer id){
     Optional<Address> address = addressRepository.findById(id);
     AddressResponseDto addressResponseDto = new AddressResponseDto();

     if (address.isPresent()){
         addressResponseDto = convertAddressModelToAddressResponseDto(address.get());
     }

     return addressResponseDto;
 }

    private AddressResponseDto convertAddressModelToAddressResponseDto(Address address) {

//     AddressResponseDto addressResponseDto = AddressResponseDto.builder()
//             .userId(address.getUserId())
//             .address(address.getAddress())
//             .pinCode(address.getPinCode())
//             .build();
        return AddressResponseDto.builder()
                .userId(address.getUserId())
                .address(address.getAddress())
                .pinCode(address.getPinCode())
                .build();
    }

}
