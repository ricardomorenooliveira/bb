package com.bb;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CotacaoDolarResourceTest {

    @Test
    public void testGetCotacaoDolarComercial() {
        given()
          .when().get("/cotacaoDolar/comercial/dataCotacao/01-04-2020")
          .then()
             .statusCode(200);
    }

}