package dataDrivenAPITesting;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class dataDrivenExample {
	
	
	public class ValidateCRUDSonAPICreated {
		
	//@Test(dataProvider = "dataForPost")
	public void test_post(String firstName , String lastName , int subjectId) {
		
		JSONObject request = new JSONObject();
		
		
		request.put("firstName", firstName);
		request.put("lastName",  lastName);
		request.put("subjectId", subjectId);
		baseURI = "http://localhost:3000/";
		
		given().contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type","application/json").
		body(request.toJSONString()).
		
		when().post("/users").
		
		then().
		statusCode(201).
		log().all();
			
				
		
	}
	
	}
	@Test(dataProvider = "dataForDelete")
	public void test_delete(int id) {
		
		JSONObject request = new JSONObject();
		
		
		baseURI = "http://localhost:3000/";
		
		
		
		when().delete("/users/"+id).
		
		then().
		statusCode(200).
		log().all();
			
				
		
	}
}}
