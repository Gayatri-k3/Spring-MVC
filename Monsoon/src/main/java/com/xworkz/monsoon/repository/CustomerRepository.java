package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.CustomerDTO;

public interface CustomerRepository {
    Integer save(CustomerDTO customerDTO);
}
