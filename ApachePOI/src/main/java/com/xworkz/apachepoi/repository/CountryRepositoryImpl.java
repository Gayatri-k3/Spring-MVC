package com.xworkz.apachepoi.repository;

import com.xworkz.apachepoi.dto.CountryDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountryRepositoryImpl implements CountryRepository {

    @Override
    public List<CountryDTO> readFromExcel(String filename) {
        List<CountryDTO> countriesList = new ArrayList<>();

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename)) {
            if (inputStream == null) {
                System.out.println(" File not found in resources folder: " + filename);
                return countriesList;
            }

            Workbook workbook = new XSSFWorkbook(inputStream);
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
                                if (shortCode.isEmpty()) {
                                    shortCode = cell.getStringCellValue().trim();
                                } else if (name.isEmpty()) {
                                    name = cell.getStringCellValue().trim();
                                } else {
                                    System.out.println("Random data::" + cell.getStringCellValue());
                                }
                                break;
                            case NUMERIC:
                                System.out.println("Random numeric data::" + cell.getNumericCellValue());
                                break;
                        }
                    }

                    countriesList.add(new CountryDTO(name, shortCode));
                }
            }

            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return countriesList;
    }
}
