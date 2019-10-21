package dev.quarks;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

@QuarkusTest
public class SimpleJsonServiceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/greetings/flo")
          .then()
             .statusCode(200)
             .body("message", equalTo("hello"));
    }

}