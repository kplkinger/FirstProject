package examples;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class ValidateCRUDSonAPICreated {

	

	//@Test
	public void Test_01(){
		baseURI = "http://localhost:3000/";
		
		given().param("name", "Automation")
		.get("/subjects").then().statusCode(200)
		.log().all();
		}
	
	@Test
	public void test_post() {
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", "abc");
		request.put("lastName", "bcd");
		request.put("subjectId", "1");
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
	
	//@Test
	public void test_patch() {
		
		JSONObject request = new JSONObject();
		
		
		request.put("lastName", "shephered");

		baseURI = "http://localhost:3000/";
		
		given().contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type","application/json").
		body(request.toJSONString()).
		
		when().patch("/users/Q4MWqC9").
		
		then().
		statusCode(200).
		log().all();
			
				
		
	}
	
	//@Test
	public void test_put() {
		
		JSONObject request = new JSONObject();
		
		
		request.put("firstName", "shepheredMary");
		request.put("lastName", "shephered");
		request.put("subjectId", "1");
		baseURI = "http://localhost:3000/";
		
		given().contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type","application/json").
		body(request.toJSONString()).
		
		when().put("/users/Q4MWqC9").
		
		then().
		statusCode(200).
		log().all();
			
				
		
	}@Test
	public void test_delete() {
		
		JSONObject request = new JSONObject();
		
		
		baseURI = "http://localhost:3000/";
		
		
		
		when().delete("/users/Q4MWqC9").
		
		then().
		statusCode(200).
		log().all();
			
				
		
	}
}
