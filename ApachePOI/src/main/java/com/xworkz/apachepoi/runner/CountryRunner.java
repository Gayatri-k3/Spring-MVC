package com.xworkz.apachepoi.runner;

import com.xworkz.apachepoi.dto.CountryDTO;
import com.xworkz.apachepoi.repository.CountryRepository;
import com.xworkz.apachepoi.repository.CountryRepositoryImpl;

import java.util.List;


public class CountryRunner {
    public static void main(String[] args) {
        CountryRepository countryRepository = new CountryRepositoryImpl();
        List<CountryDTO> list = countryRepository.readFromExcel("Countries.xlsx");
        System.out.println(list);
    }
}
