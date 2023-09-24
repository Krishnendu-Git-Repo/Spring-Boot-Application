package com.example.demo.exporter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.example.demo.model.Customer;

public class ExcelFileExporter {
	public static ByteArrayInputStream exportCustomerListToExcelFile(List<Customer> customers) {
		try (Workbook workbook = new XSSFWorkbook()) {

			Sheet sheet = workbook.createSheet("Customers");
			Row row = sheet.createRow(0);
			CellStyle headerCellStyle = workbook.createCellStyle();
			headerCellStyle.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
			headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

			// creating header cells
			Cell cell = row.createCell(0);
			cell.setCellValue("First Name");
			cell.setCellStyle(headerCellStyle);

			cell = row.createCell(1);
			cell.setCellValue("Last Name");
			cell.setCellStyle(headerCellStyle);

			cell = row.createCell(2);
			cell.setCellValue("Address");
			cell.setCellStyle(headerCellStyle);

			// creating data row for each of customer object
			for (int i = 0; i < customers.size(); i++) {
				Row dataRow = sheet.createRow(i + 1); // i+1 because to exclude the header row
				dataRow.createCell(0).setCellValue(customers.get(i).getFirstName());
				dataRow.createCell(1).setCellValue(customers.get(i).getLastName());
				dataRow.createCell(2).setCellValue(customers.get(i).getAddress());

				// making sure the size of Excelcell auto resize to fit the data
				sheet.autoSizeColumn(0);
				sheet.autoSizeColumn(1);
				sheet.autoSizeColumn(2);

				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				workbook.write(outputStream);
				return new ByteArrayInputStream(outputStream.toByteArray());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
