package br.com.jus.base.auth.requests;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;

import static br.com.jus.data.factory.BaseData.URL_TOKEN;
import static io.restassured.RestAssured.given;

public class PostAuthRequest {

    private static String TOKEN;

    public static String gerarToken() {

        TOKEN =
                given()
                        .contentType("application/x-www-form-urlencoded; charset=utf-8")
                        .formParam("grant_type", "password")
                        .formParam("username", "quality.assurance")
                        .formParam("password", "qualidade")
                        .formParam("client_id", "sedu-client")
                        .when()
                        .accept("application/json")
                        .post(URL_TOKEN)
                        .then()
                        .statusCode(HttpStatus.SC_OK)
                        .extract().path("access_token");


        return TOKEN;

    }


    @Step("Buscar o token")
    public Response token() {
        JSONObject payload = new JSONObject();
        payload.put("username", "quality.assurance");
       // payload.put("password", "password123");
        payload.put("password", "qualidade");


        return given()
                .header("Content-Type", "application/json")
                .when()
                .body(payload.toString())
                .post("auth");
    }


    @Step("Retornar o token")
    public String getToken() {

        return "token=" + this
                .token()
                .then()
                .statusCode(200)
                .extract().path("token");
    }

    @Step("Obtém o token da api SocioEducativo do ambiente de Qualidade - https://qa-sedu-api.stg.cloud.cnj.jus.br")
    public Response tokenPrivate() throws Exception {
        RestAssured.baseURI = "https://qa-sedu-api.stg.cloud.cnj.jus.br";
        return given()
                .header("Authorization", "Basic cmVubmVyLXBhcmNlaXJvOnBhcmNlaXJv")
                .contentType("application/json")
                .when().post("api/...");
    }
}
