package com.xworkz.apachepoi.repository;

import com.xworkz.apachepoi.dto.CountryDTO;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class CountryRepositoryImpl implements CountryRepository {
    @Override
    public List<CountryDTO> readFromExcel(String filename) {
        List<CountryDTO> countriesList = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            Workbook workbook = null;
            if (filename.toLowerCase().endsWith("xlsx")) {
                workbook = new XSSFWorkbook(fileInputStream);
            } else if (filename.toLowerCase().endsWith("xls")) {
                workbook = new HSSFWorkbook(fileInputStream);
            }
            int numberOfSheets = workbook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workbook.getSheetAt(i);

                Iterator<Row> rowIterator = sheet.iterator();
                while (rowIterator.hasNext()) {
                    String name = "";
                    String shortCode = "";

                    Row row = rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();

                        switch (cell.getCellType()) {
                            case STRING:
                                if (shortCode.equalsIgnoreCase("")) {
                                    shortCode = cell.getStringCellValue().trim();
                                } else if (name.equalsIgnoreCase("")) {
                                    name = cell.getStringCellValue().trim();
                                } else {
                                    System.out.println("Random data::" + cell.getStringCellValue());
                                }
                                break;
                            case NUMERIC:
                                System.out.println("Random data::" + cell.getNumericCellValue());
                        }
                    }
                    CountryDTO countryDTO = new CountryDTO(name, shortCode);
                    countriesList.add(countryDTO);
                }
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countriesList;
    }
}