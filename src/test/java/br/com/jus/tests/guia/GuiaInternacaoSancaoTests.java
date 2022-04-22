package br.com.jus.tests.guia;

import br.com.jus.base.auth.requests.PostAuthRequest;
import br.com.jus.config.Configuration;
import br.com.jus.data.factory.guia.GuiaProvisoriaDataFactory;
import br.com.jus.data.factory.guia.GuiaSancaoInternacaoDataFactory;
import br.com.jus.data.pojo.guia.GuiaInternacaoSancao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.ValidatableResponse;
import org.aeonbits.owner.ConfigFactory;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class GuiaInternacaoSancaoTests {

    private String token;

    private GuiaInternacaoSancao guiaInternacaoSancaoValida;

    @Before

    public void setUp() throws Exception{

        Configuration config = ConfigFactory.create(Configuration.class);

        guiaInternacaoSancaoValida = GuiaSancaoInternacaoDataFactory.criarGuiaInternacaoSancao();

        baseURI = config.baseURI();
        port = config.port();
        basePath = config.guiasPath();

        token = PostAuthRequest.gerarToken();

    }
    @Test
    public void deveLancarSucessoInternacaoSancao() throws JsonProcessingException {
        RestAssured.defaultParser = Parser.JSON;

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(guiaInternacaoSancaoValida);

        given()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(guiaInternacaoSancaoValida)
                .when()
                .post("/internacao-sancao")
                .then().log().all()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schemas/postGuiaInternacaoSancao.json"));
    }



}
