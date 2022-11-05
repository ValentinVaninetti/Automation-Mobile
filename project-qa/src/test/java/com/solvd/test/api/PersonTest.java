package com.solvd.test.api;

import com.solvd.test.api.POJOS.PersonPojo;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PersonTest {
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String APIURL = "https://634087c9d1fcddf69cba631f.mockapi.io/";
    private static final String APPLICATION_JSON = "application/json";

    @Test
        public void itTestThatGETMethodWorks() {
            Response response =
                given()
                    .header(CONTENT_TYPE, APPLICATION_JSON)
                    .contentType(APPLICATION_JSON).accept(APPLICATION_JSON)
                    .when()
                    .get(APIURL + "automation/1");
               PersonPojo pj = response.as(PersonPojo.class);
                System.out.println(pj);
                response.then().statusCode(ResponseCode.STATUS_200);
        }

    @Test
    public void itTestsThatPOSTMethodWorks(){
        Response response =
                given()
                    .header(CONTENT_TYPE, APPLICATION_JSON)
                    .contentType(APPLICATION_JSON).accept(APPLICATION_JSON)
                    .when()
                        .post(APIURL + "automation" );
                response.then().statusCode(201);
    }

}
