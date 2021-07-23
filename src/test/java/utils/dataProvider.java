package utils;
public class dataProvider {
	String projDir = System.getProperty("user.dir");
	String excelPath= projDir+"/data/TestData.xlsx";
	String sheetName = "Sheet1";
	
	
	public void dataread()
	{
		ExceUtils ex= new ExceUtils(excelPath, sheetName);
		ex.getRowCount();
		ex.getCellData(1, 0);
		ex.getCellData(1, 1);
		ex.getCellData(1, 2);
		
				
	}
}
