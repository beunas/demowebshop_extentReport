package org.demoWebShop.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.demoWebShop.constants.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcelUtility {
    public static XSSFWorkbook wb;
    public static XSSFSheet sh;
    public static FileInputStream f;
    public List<String> readDataFromExcel(String sheetName) {
        DataFormatter formatter = new DataFormatter();
        try {
            f = new FileInputStream(System.getProperty("user.dir") + Constants.EXCEL_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            wb = new XSSFWorkbook(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sh = wb.getSheet(sheetName);
        ArrayList<String> excelRows = new ArrayList<String>();

        for(Row r : sh) {
            for (Cell c : r) {
                excelRows.add(formatter.formatCellValue(c));
            }
        }
        return excelRows;
    }


    public  List<List<String>> excelDataReader(String sheetName)  {

        DataFormatter formatter = new DataFormatter();
        try {
            f = new FileInputStream(System.getProperty("user.dir") + Constants.EXCEL_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            wb = new XSSFWorkbook(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sh = wb.getSheet(sheetName);
        List<List<String>> excelRows = new ArrayList<>();
        int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
        for (int i = 0; i < rowCount+1; i++) {
            int x = 0;
            Row row = sh.getRow(i);
            String[] columnList = new String[row.getLastCellNum()];
            for (int j = 0; j < columnList.length; j++) {
                columnList[j] =formatter.formatCellValue(row.getCell(x));
                x++;
            }
            excelRows.add(new ArrayList<>(Arrays.asList(columnList)));
        }
        return excelRows;
    }
}
