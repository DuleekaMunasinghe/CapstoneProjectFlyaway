package com.FltawayAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRequest_Response {

    String BaseURL = "http://localhost:8080/FlyAway";
    RequestSpecification reqSpec;

    @BeforeClass
    public void before() {
        RestAssured.baseURI = BaseURL;
        reqSpec = RestAssured
                .given()
                .header("Content-Type", "application/json");
    }

    @Test
    public void TestLogin() {

        Response resp = reqSpec
                .when()
                .get("/?source=1&destination=4");
        System.out.println("Response " + resp.asPrettyString());
        Assert.assertEquals(resp.getStatusCode(), 200);
       
     
        String responseBody = resp.getBody().asString();
        Assert.assertTrue(responseBody.contains("FLYAWAY HOMEPAGE"));
        Assert.assertTrue(responseBody.contains("Select Source"));
        Assert.assertTrue(responseBody.contains("Select Destination"));
        Assert.assertTrue(responseBody.contains("AirAsia"));
        Assert.assertTrue(responseBody.contains("Dep.8 pm Arr.9.30pm (1.30 hours)"));
        Assert.assertTrue(responseBody.contains("4500.00"));
        Assert.assertTrue(responseBody.contains("<a href=\"bookflight?id=3\">Book Flight</a>"));


    }



}
