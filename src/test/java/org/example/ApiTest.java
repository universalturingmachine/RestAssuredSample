package org.example;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    @BeforeAll
    public static void setup() {
        // Set the base URL for the WireMock server (assuming it runs on localhost:9090)
        RestAssured.baseURI = "http://localhost:8080";
    }

    @Test
    public void testExistingUser() {
        // Perform a GET request to /users/1 and validate the response
        given()
                .when()
                .get("/users/1") // Replace with the actual API endpoint
                .then()
                .statusCode(200) // Check for a 200 OK status
                .body(equalTo("User 1 found")); // Check the response body message
    }

    @Test
    public void testNonExistingUser() {
        // Perform a GET request to /users/1 and validate the response
        given()
                .when()
                .get("/users/2") // Replace with the actual API endpoint
                .then()
                .statusCode(404) // Check for a 200 OK status
                .body(equalTo("User 2 not found")); // Check the response body message
    }
}
