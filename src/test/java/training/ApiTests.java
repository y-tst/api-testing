package training;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTests {

    @Test
    public void getCategories() {
        String endpoint = "http://localhost:3307/api_testing/category/read.php";
        var response = given().when().get(endpoint).then();
    }

    @Test
    public void getProduct() {
        String endpoint = "http://localhost:3307/api_testing/product/read_one.php";
        var response = given()
                .queryParam("id", 2)
                .when()
                .get(endpoint)
                .then();

    }
}
