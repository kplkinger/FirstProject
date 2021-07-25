package BasicRestAssured;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

public class Test01_GET {

	@Test 	
		void Test_01() {
		
		Response response= RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.statusCode());
		System.out.println("////");
		System.out.println(response.headers());
		System.out.println("////");
		System.out.println(response.asString());
		System.out.println("////");
		System.out.println(response.getBody());
		System.out.println("////");
		System.out.println(response.getStatusCode());
		System.out.println("////");
		System.out.println(response.getTime());
		System.out.println("////");
		System.out.println(response.timeIn(TimeUnit.SECONDS));
		
		int ststuscode= response.getStatusCode();
		Assert.assertEquals(ststuscode, 200);
	}
	
	@Test
	void test_02() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
		.body("body.id[0]", equalTo(null));
		}
}
