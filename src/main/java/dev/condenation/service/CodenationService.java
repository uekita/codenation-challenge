package dev.condenation.service;

import dev.condenation.model.Criptografia;

import java.io.File;
import java.net.URI;

import static io.restassured.RestAssured.given;

public class CodenationService extends CodeNationAPI {

    String TOKEN = "d606c48d29490449e376cda011d6d06c7f8791ab";

    public Criptografia getChallange() throws Exception {
        return given()
                .spec(this.requestSpecification())
                .when()
                .get(new URI("/generate-data?token=" + TOKEN))
                .then()
                .statusCode(200)
                .extract().body()
                .jsonPath()
                .getObject("", Criptografia.class);
    }

    public void sendAnwser(File file) throws Exception {
        given()
                .spec(this.requestSpecification())
                .multiPart("answer", file, "multipart/form-data")
                .when()
                .post(new URI("/submit-solution?token=d606c48d29490449e376cda011d6d06c7f8791ab"))
                .then()
                .statusCode(200)
                .extract().body().jsonPath().prettyPrint();
    }
}
