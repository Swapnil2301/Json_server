package json;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class json_server {
    @Test
    public void post_info(){
        Response res = given()
                .header("Accept","*/*")
                .header("Content-Type\n","application/json\n")
                .body("{\n" +
                        "        \"id\": \"21\",\n" +
                        "        \"name\": \"swapnil Graham\",\n" +
                        "        \"username\": \"Bret\",\n" +
                        "        \"email\": \"Sincere@april.biz\"\n" +
                        "    }")
                .when()
                .post("http://localhost:3000/Users");
        res.prettyPrint();
    }
    @Test
    public void get_data(){
        Response response =given()
                .header("Accept","*/*\n")
                .header("Content-Type\n","application/json\n")
                .when()
                .get("http://localhost:3000/Users");
        response.prettyPrint();

    }
    @Test
    public void put_data(){
        Response response = given()
                .header("Accept","*/*\n")
                .header("Content-Type\n","application/json\n")
                .body("{\n" +
                        "        \"id\": \"21\",\n" +
                        "        \"name\": \"swapnil Graham\",\n" +
                        "        \"username\": \"swap\",\n" +
                        "        \"email\": \"Sincere@april.biz\"\n" +
                        "    }")
                .when()
                .put("http://localhost:3000/Users/21");
        response.prettyPrint();

    }
    @Test
    public void delete_data(){
        Response response = given()
                .header("Accept","*/*\n")
                .header("Content-Type\n","application/json\n")
                .when()
                .delete("http://localhost:3000/Users/21");
        response.prettyPrint();

    }
}
