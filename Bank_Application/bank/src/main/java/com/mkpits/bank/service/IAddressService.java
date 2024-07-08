package com.mkpits.bank.service;

import com.mkpits.bank.dto.response.AddressResponseDto;

public interface IAddressService {
    AddressResponseDto getAddress(Integer id);
}
