package br.com.jus.tests.guia;

import br.com.jus.base.auth.requests.PostAuthRequest;
import br.com.jus.config.Configuration;
import br.com.jus.data.factory.guia.GuiaDefinitivaDataFactory;
import br.com.jus.data.pojo.guia.GuiaDefinitiva;

import br.com.jus.data.pojo.guia.GuiaProvisoria;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.aeonbits.owner.ConfigFactory;

import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class GuiaDefinitivaTests {

    private String token;
    private GuiaDefinitiva guiaDefinitivaValida;
    private GuiaProvisoria guiaProvisoriaValida;

    @Before
    public void setUP() throws Exception {

        Configuration config = ConfigFactory.create(Configuration.class);
        guiaDefinitivaValida = GuiaDefinitivaDataFactory.criarGuiaDefinitiva();

        baseURI = config.baseURI();
        port = config.port();
        basePath = config.guiasPath();

        token = PostAuthRequest.gerarToken();


    }
    @Test
    public void deveLancarSucessoGuiaAoValidar() throws JsonProcessingException {
        defaultParser = Parser.JSON;

       given()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(guiaDefinitivaValida)
                .when()
                .post("/definitiva")
                .then().log().all()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schemas/postguiaDefinitivaValida.json"));



    }
    @Test
    public void deveValidarCamposObrigatorios() throws JsonProcessingException {
        defaultParser = Parser.JSON;
        guiaDefinitivaValida.setIdentificadorAdolescente(null);
        guiaDefinitivaValida.setIdentificadorAdolescente(null);
        guiaDefinitivaValida.setNumeroProcessoConhecimento(null);
        guiaDefinitivaValida.setCodigoTpuMedida(null);
        guiaDefinitivaValida.setOrigemGuia(null);
        guiaDefinitivaValida.setAtosInfracionais(null);
        guiaDefinitivaValida.setMagistradoCPF(null);
        guiaDefinitivaValida.setServentuarioCargo(null);
        guiaDefinitivaValida.setServentuarioCPF(null);

        given()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(guiaDefinitivaValida)
                .when()
                .post("/definitiva")
                .then().log().all()
                .statusCode(400);




    }
    @Test
    public void deveValidarCamposCPFsInvalidos() throws JsonProcessingException {

        RestAssured.defaultParser = Parser.JSON;

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(guiaDefinitivaValida);

        guiaDefinitivaValida.setMagistradoCPF("751041510100");
        guiaDefinitivaValida.setCodigoTpuMedida("123456");
        guiaDefinitivaValida.setNumeroProcessoConhecimento("12345678945");
        guiaDefinitivaValida.setServentuarioCPF("00751041510100");
        guiaDefinitivaValida.setIdentificadorAdolescente("86478956241");

        Response response = given ()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(guiaDefinitivaValida)
                .when()
                .post("/provisoria")
                .then().log().all()
                .statusCode(400)
                .extract().response();
    }





}
