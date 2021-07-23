package dataDrivenAPITesting;

import org.testng.annotations.DataProvider;

public class DataForTests {
	@DataProvider(name= "dataForPost")
	public Object[][] dataForPost() {
		Object[][] data = new Object[2][3];
		data[0][0]= "Thomas";
		data[0][1]= "Edison";
		data[0][2]= 2;
		data[1][0]= "Albert";
		data[1][1]= "Einstien";
		data[1][2]= 1;
		return data;
	}
	@DataProvider(name= "dataForDelete")
	public Object[] dataForDelete() {
		return new Object[] {
				2
		};
}}
