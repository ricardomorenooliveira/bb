package com.bb.rest.client.resource;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CotacaoDolarResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/country")
          .then()
             .statusCode(200)
             .body(is("hellooooooooo!"));
    }
    
    @Test
    public void testCountryNameEndpoint() {
        given()
          .when().get("/country/name/greece")
          .then()
             .statusCode(200)
             .body("$.size()", is(1),
                     "[0].alpha2Code", is("GR"),
                     "[0].capital", is("Athens"),
                     "[0].currencies.size()", is(1),
                     "[0].currencies[0].name", is("Euro")
             );
    }


}
