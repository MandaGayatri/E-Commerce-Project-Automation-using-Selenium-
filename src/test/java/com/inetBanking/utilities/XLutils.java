package com.inetBanking.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLutils
{
public static FileInputStream fi;
public static FileOutputStream fo;
public static XSSFWorkbook wb;
public static XSSFSheet ws;
public static XSSFRow row;
public static XSSFCell cell;

      public static int getRowCount(String XLFile , String XLSheet) throws Exception
{
               fi = new FileInputStream(XLFile);
                wb = new XSSFWorkbook(fi);
                ws = wb.getSheet(XLSheet);
                int rcount = ws.getLastRowNum();
                wb.close();
                fi.close();
                return rcount;
}
      public static int getCellCount(String XLFile, String XLSheet, int rownum) throws Exception
      {
    	  fi = new FileInputStream(XLFile);
    	  wb = new XSSFWorkbook(fi);
    	  ws = wb.getSheet(XLSheet);
    	  row = ws.getRow(rownum);
    	  int cellcount = row.getLastCellNum();
    	  wb.close();
    	  fi.close();
    	  return cellcount;
    	  
      }
      public static String  getCellData(String XLFile, String XLSheet, int rownum, int colnum)  throws  Exception
      {
    	  fi = new FileInputStream(XLFile);
    	  wb = new XSSFWorkbook(fi);
    	  ws = wb.getSheet(XLSheet);
    	  row = ws.getRow(rownum);
    	  cell = row.getCell(colnum);
    	  String data;
    	  try {
    		  DataFormatter formatter = new DataFormatter();
    		 String cellData = formatter.formatCellValue(cell);
    		  return cellData;
    	  }
    	  catch(Exception e)
    	  {
    		  data = "";
    	  }
    	  wb.close();
    	  fi.close();
    	  return data;
      }
      public static void setCellData(String XLFile, String XLSheet, int rownum,int colnum,String data) throws Exception
      {
    	  fi = new FileInputStream(XLFile);
          wb = new XSSFWorkbook(fi);
          ws = wb.getSheet(XLSheet);
          row = ws.getRow(rownum);
          cell = row.createCell(colnum);
          cell.setCellValue(data);
          fo= new FileOutputStream(XLFile);
          wb.write(fo);
          wb.close();
          fi.close();
          fo.close();
      }
    	  
      }