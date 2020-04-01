import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class Test {

    @BeforeEach
    public void init2() {
        System.out.println("Тестрирование метода <Create new user> на ресурсе <https://gorest.co.in> ");
    }


    @org.junit.jupiter.api.Test
    public void testTrue() {
        Response response = (Response) RestAssured.given().baseUri("https://gorest.co.in")
                .basePath("public-api")
                .header("Authorization", "Bearer gd2jyTQLQgJhSKGwXsJsn7xYB01Jmnano517")
                .param("email", "juppibezuva-9087@yopmail.com")
                .param("first_name", "Galin")
                .param("last_name", "Br")
                .param("gender", "female")
                .param("status", "active")
                .post("/users");
        response.getBody().prettyPrint();
    }

    @org.junit.jupiter.api.Test
    public void testIncorrectEmail() {
        Response response = (Response) RestAssured.given().baseUri("https://gorest.co.in")
                .basePath("public-api")
                .header("Authorization", "Bearer gd2jyTQLQgJhSKGwXsJsn7xYB01Jmnano517")
                .param("email", "NotEmail")
                .param("first_name", "Galin")
                .param("last_name", "Br")
                .param("gender", "female")
                .param("status", "active")
                .post("/users");
        response.getBody().prettyPrint();
    }

    @AfterEach
    public void init3() {
        System.out.println("Тестирование закончено");
    }
}