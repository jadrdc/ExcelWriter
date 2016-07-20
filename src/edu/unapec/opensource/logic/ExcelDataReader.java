package edu.unapec.opensource.logic;

import edu.unapec.opensource.models.ViewInformation;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by LENOVO on 17/07/2016.
 */

public class ExcelDataReader {
private XSSFWorkbook workbook;
private ViewInformation viewData;


    public  ExcelDataReader()
    {
        try {
            workbook= new XSSFWorkbook(new FileInputStream("C:\\Users\\LENOVO\\IdeaProjects\\OpenSourceContabilidad\\data\\BD.xlsx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public  ViewInformation getNewCalculation()
{
    Iterator<Row> it = workbook.getSheetAt(0).rowIterator();
    viewData = new ViewInformation();

    it.next();
    while(it.hasNext())
    {
        Row row = (Row) it.next();
        viewData.setProductQuantity(viewData.getProductQuantity()+row.getCell(1).getNumericCellValue());
        viewData.setGrandTotal(viewData.getGrandTotal()+
                row.getCell(2).getNumericCellValue()*  row.getCell(1).getNumericCellValue());
      viewData.setTaxttotal(
                viewData.getTaxttotal()+
               row.getCell(3).getNumericCellValue()/100* row.getCell(2).getNumericCellValue()*
                       row.getCell(1).getNumericCellValue()

        );


        viewData.setGrandTotalTax(viewData.getGrandTotal()+viewData.getTaxttotal());
    }




    return  viewData ;
}


    public void updateFile()
    {
        XSSFRow row=workbook.getSheetAt(1).getRow(1);
       row.getCell(0).setCellValue(viewData.getGrandTotal());
        row.getCell(1).setCellValue(viewData.getTaxttotal());
        row.getCell(2).setCellValue(viewData.getGrandTotalTax());
        row.getCell(3).setCellValue(viewData.getProductQuantity());
        FileOutputStream out = null;
        try {
            out = new FileOutputStream  ("C:\\Users\\LENOVO\\IdeaProjects\\OpenSourceContabilidad\\data\\BD.xlsx");
            workbook.write(out);
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }












}
