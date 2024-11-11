package readWriteClasses;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWriteClasses  {

    FileInputStream file;
    XSSFWorkbook workbook;

    public ReadWriteClasses()
    {
        try {
            file = new FileInputStream("/Users/rajanbhardwaj/Desktop/Selenium_WorkSpace/SeleniumGitJenkins/src/test/resources/ExcelSheet.xlsx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
             workbook=new XSSFWorkbook(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readUsername()
    {
        XSSFSheet sheet= workbook.getSheet("Sheet1");
        XSSFRow row= sheet.getRow(1);
        XSSFCell cell=row.getCell(0);
        String username=cell.getStringCellValue();
        return username;

    }

    public String readPassword()
    {
        XSSFSheet sheet= workbook.getSheet("Sheet1");
        XSSFRow row= sheet.getRow(1);
        XSSFCell cell1=row.getCell(1);
        String password=cell1.getStringCellValue();
        System.out.println("RAM");
        return password;


    }





}
