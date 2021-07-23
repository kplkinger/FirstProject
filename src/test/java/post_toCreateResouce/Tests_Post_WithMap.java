package post_toCreateResouce;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;



public class Tests_Post_WithMap {
	@Test
	public void test_1_Post() {
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		
		System.out.println(request);
		System.out.println(request.toJSONString());
	}
	
	
}
