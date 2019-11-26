package dev.condenation.service;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class CodeNationAPI {
    String BASE_URI = "https://api.codenation.dev";
    String BASE_PATH = "/v1/challenge/dev-ps";

    public RequestSpecification requestSpecification(){
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .setBasePath("/v1/challenge/dev-ps")
                .build();
    }

}
