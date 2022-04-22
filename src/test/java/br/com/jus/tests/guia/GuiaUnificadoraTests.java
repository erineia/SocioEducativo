package br.com.jus.tests.guia;

import br.com.jus.base.auth.requests.PostAuthRequest;
import br.com.jus.config.Configuration;
import br.com.jus.data.factory.guia.GuiaDefinitivaDataFactory;
import br.com.jus.data.factory.guia.GuiaUnificadoraDataFactory;
import br.com.jus.data.pojo.guia.GuiaDefinitiva;
import br.com.jus.data.pojo.guia.GuiaUnificadora;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import org.aeonbits.owner.ConfigFactory;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class GuiaUnificadoraTests {

    private String token;
    private GuiaUnificadora GuiaUnificadoraValida;

    @Before
    public void setUP() throws Exception {

        Configuration config = ConfigFactory.create(Configuration.class);
        GuiaUnificadoraValida = GuiaUnificadoraDataFactory.criarGuiaUnificadora();

        baseURI = config.baseURI();
        port = config.port();
        basePath = config.guiasPath();

        token = PostAuthRequest.gerarToken();


    }
    @Test
    public void deveVerificarGuiaUnificadora() throws JsonProcessingException {
        RestAssured.defaultParser = Parser.JSON;

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

        String json = ow.writeValueAsString(GuiaUnificadoraValida);

        System.out.println(json);

        given()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(GuiaUnificadoraValida)
                .when()
                .post("/unificadora")
                .then().log().all()
                .statusCode(200);
                //.body(matchesJsonSchemaInClasspath("schemas/GuiaUnificadoraValida.json"));
    }




}
