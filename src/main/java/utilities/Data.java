package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

	XSSFSheet sheet = null;
	FileInputStream file = null;
	XSSFWorkbook workbook = null;
	List<List<Object>> data = null;
	int testCaseRow = -1;
	int testCaseDataRow = -1;

	public Data(String sheetName) {
		String path = GlobalKeys.configData.get("TestDataFile");
		this.data = Util.GetExcelTableInto2DArrayListString(path, sheetName);
	}

	public String get(String Label) {
		try {
			for (int i = 0; i < data.get(testCaseRow).size(); i++) {
				String colName = data.get(testCaseRow).get(i).toString();
				if (colName.equals(Label)) {
					return data.get(testCaseDataRow).get(i).toString();
				}
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "";
	}

	public void setIndex(String testDataSet) {
		try {
			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).size() > 1) {
					if (data.get(i).get(1).toString().equals(testDataSet)) {
						this.testCaseDataRow = i;
						break;
					}
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void setColIndex(String testCaseName) {
		try {
			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).size() > 1) {
					if (data.get(i).get(1).toString().equals(testCaseName)) {
						this.testCaseRow = i;
						break;
					}
				}
			}
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}

	public ArrayList<String> getDataSets(String testCaseName) {
		ArrayList<String> dataSets = new ArrayList();
		
		try {
			GlobalKeys.elementLoadWaitTime = Integer.parseInt(GlobalKeys.configData.get("ElementLoadWaitTime"));
			GlobalKeys.implicitlyWaitTime = Integer.parseInt(GlobalKeys.configData.get("ImplicitlyWaitTime"));
			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).size() > 1) {
					if ((data.get(i).get(1).toString().contains(testCaseName))
							&& (data.get(i).get(2).toString().equalsIgnoreCase("yes"))) {
						dataSets.add(data.get(i).get(1).toString());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataSets;
	}
	
	public void WriteUserEmailToConfigExcel(String UserEmail) {

		try {

			FileInputStream fs = new FileInputStream("./src/test/resources/TestData/TestConfiguration.xlsx");

			XSSFWorkbook workbook = new XSSFWorkbook(fs);

			XSSFSheet Configsheet = workbook.getSheet("config");

			XSSFRow row;

			int lastRow = Configsheet.getLastRowNum();
			for (int i = 0; i <= lastRow; i++) {
				row = Configsheet.getRow(i);
				Cell cell = row.getCell(1);

				if (cell.getStringCellValue().equalsIgnoreCase("UserEmail")) {

					row.getCell(2).setCellValue(UserEmail);
					break;
				}

			}

			Map<String, Object[]> Configdata = new TreeMap<String, Object[]>();

			FileOutputStream out = new FileOutputStream(
					new File("./src/test/resources/TestData/TestConfiguration.xlsx"));

			workbook.write(out);
			
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
