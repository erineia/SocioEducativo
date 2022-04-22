package br.com.jus.data.factory.guia;

import br.com.jus.data.pojo.guia.GuiaDefinitiva;
import br.com.jus.data.pojo.guia.GuiaProvisoria;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class GuiaGerarPDFDataFactory {
    public static  String CriarNumeroGuia (String token, String baseURI, String basePath, GuiaDefinitiva guiaDefinitivaValida  ) throws JsonProcessingException {

        RestAssured.defaultParser = Parser.JSON;


        Response response = given()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(guiaDefinitivaValida)
                .when()
                .post("/definitiva")
                .then().log().all()
                .statusCode(200)
                .extract().response();

        JsonPath jsonPathEvaluator = response.jsonPath();

        return jsonPathEvaluator.get("dados.numeroGuia");
    }

//    public static  String CriarNumeroGuia (String token, String baseURI, String basePath, GuiaProvisoria guiaProvisoriaValida  ) throws JsonProcessingException
//        {
//
//            RestAssured.defaultParser = Parser.JSON;
//
//
//            Response response = given()
//                    .baseUri(baseURI)
//                    .basePath(basePath)
//                    .contentType(ContentType.JSON)
//                    .header("Authorization", "Bearer " + token)
//                    .body(guiaProvisoriaValida)
//                    .when()
//                    .post("/provisoria")
//                    .then().log().all()
//                    .statusCode(200)
//                    .extract().response();
//
//            JsonPath jsonPathEvaluator = response.jsonPath();
//            return jsonPathEvaluator.get("dados.numeroGuia");
//
//
//        }



}
