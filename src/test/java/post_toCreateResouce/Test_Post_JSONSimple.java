package post_toCreateResouce;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_Post_JSONSimple {
	@Test
	public void test_2_Post() {
		
	
		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "Teacher");		
		System.out.println(request.toJSONString());
		
		
		given().
			header("ContentType", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201);
			
	}
}
