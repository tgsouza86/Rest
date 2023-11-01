package tiago.sp.gsouza.rest;

import static io.restassured.RestAssured.given;

import org.junit.Test;


public class AuthTest {
	
	@Test
	
	public void deveAcessarSWAPI()
	{ 
		
		given()
			.log().all()
		.when()
		.then();
		
	}

}
