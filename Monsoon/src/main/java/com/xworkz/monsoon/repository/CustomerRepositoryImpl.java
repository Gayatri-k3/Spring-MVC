package com.xworkz.monsoon.repository;

import com.xworkz.monsoon.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Integer save(CustomerDTO customerDTO) {
        String sql = "Insert into connection( first_name, last_name) values (?,?)";
        return jdbcTemplate.update(sql,customerDTO.getFirstName(),customerDTO.getLastName());
    }
}
