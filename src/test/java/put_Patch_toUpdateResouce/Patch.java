package put_Patch_toUpdateResouce;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Patch {
	@Test
	public void test_3_Patch() {
		
	
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
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).log().all();
		
			
	}
}
