package com.apitesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Test01_GET {
	
	@Test
	public void test_01() {
		
		Response response=get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statusCode=response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
	}
	
	public void test_02() {
		
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200);
	}

}
