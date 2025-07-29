package com.xworkz.apachepoi.repository;

import com.xworkz.apachepoi.dto.CountryDTO;

import java.util.List;

public interface CountryRepository {
    List<CountryDTO> readFromExcel(String filename);
}
