import io.restassured.http.ContentType;
import io.restassured.specification.Argument;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class testApi {
@Test
    public void getUrl () {
    String baseUrl = "https://swapi.dev/api/starships";
    given()
            .baseUri(baseUrl)
            .basePath("/10")
            .contentType(ContentType.JSON)
            .when().get()
            .then()
            .statusCode(200)
            .body("name", equalTo("Millennium Falcon"))
            .body("cost_in_credits", equalTo("100000"))
            .body("length", equalTo("34.37"))
            .body("pilots", equalTo
                    ("https://swapi.dev/api/people/13/",
                    "https://swapi.dev/api/people/14/",
                    "https://swapi.dev/api/people/25/",
                    "https://swapi.dev/api/people/31/"));

}




}
