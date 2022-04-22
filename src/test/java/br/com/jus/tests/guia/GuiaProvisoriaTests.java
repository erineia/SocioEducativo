package br.com.jus.tests.guia;

import br.com.jus.base.auth.requests.PostAuthRequest;
import br.com.jus.config.Configuration;
import br.com.jus.data.factory.guia.DocumentosInstruirGuiaDataFactory;
import br.com.jus.data.factory.guia.GuiaProvisoriaDataFactory;
import br.com.jus.data.pojo.guia.GuiaProvisoria;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.aeonbits.owner.ConfigFactory;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import static io.restassured.RestAssured.*;

public class GuiaProvisoriaTests {

    private String token;
    private GuiaProvisoria guiaProvisoriaValida;

    @Before
    public void setUp() throws Exception {
        Configuration config = ConfigFactory.create(Configuration.class);

        guiaProvisoriaValida = GuiaProvisoriaDataFactory.criarGuiaProvisoria();

        baseURI = config.baseURI();
        port = config.port();
        basePath = config.guiasPath();

        token = PostAuthRequest.gerarToken();

    }

    @Test
    public void deveVerificarDocumentosInstruirGuia() throws JsonProcessingException {
        RestAssured.defaultParser = Parser.JSON;

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(guiaProvisoriaValida);

        //System.out.println(json);

        given()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(guiaProvisoriaValida)
                .when()
                .post("/provisoria")
                .then().log().all()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schemas/postGuiaProvisoriaValida.json"));
    }
    @Test
    public void deveVerificarDocumentosInvalidos() throws JsonProcessingException {

        RestAssured.defaultParser = Parser.JSON;

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(guiaProvisoriaValida);

        guiaProvisoriaValida.setDocumentosInstruirGuia(DocumentosInstruirGuiaDataFactory.criarDocumentosInvalidos());

       Response response = given ()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(guiaProvisoriaValida)
                .when()
                .post("/provisoria")
                .then().log().all()
                .statusCode(400)
                .extract().response();
    }


    @Test
    public void deveVerficarCampoInvalidoMedida() throws JsonProcessingException {

        RestAssured.defaultParser = Parser.JSON;

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(guiaProvisoriaValida);

        guiaProvisoriaValida.setMedida("Normas e padrões");

        Response response = given ()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(guiaProvisoriaValida)
                .when()
                .post("/provisoria")
                .then().log().all()
                .statusCode(400)
                .extract().response();
    }
    @Test
    public void deveVerificarCamposObrigatorios() throws JsonProcessingException {

        RestAssured.defaultParser = Parser.JSON;

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(guiaProvisoriaValida);

        guiaProvisoriaValida.setIdentificadorAdolescente(null);
        guiaProvisoriaValida.setNumeroProcessoConhecimento(null);
        guiaProvisoriaValida.setCodigoTpuMedida(null);
        guiaProvisoriaValida.setOrigemGuia(null);
        guiaProvisoriaValida.setDataInicioInternacao(null);
        guiaProvisoriaValida.setDataFimInternacao(null);
        guiaProvisoriaValida.setHouveInternacao(null);
        guiaProvisoriaValida.setAtosInfracionais(null);
        guiaProvisoriaValida.setMagistradoCPF(null);
        guiaProvisoriaValida.setServentuarioCargo(null);
        guiaProvisoriaValida.setServentuarioCPF(null);

        Response response = given ()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(guiaProvisoriaValida)
                .when()
                .post("/provisoria")
                .then().log().all()
                .statusCode(400)
                .extract().response();
    }

    @Test
    public void deveVerificarCamposCPFsInvalidos() throws JsonProcessingException {

        RestAssured.defaultParser = Parser.JSON;

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(guiaProvisoriaValida);

        guiaProvisoriaValida.setMagistradoCPF("751041510100");
        guiaProvisoriaValida.setCodigoTpuMedida("123456");
        guiaProvisoriaValida.setNumeroProcessoConhecimento("12345678945");
        guiaProvisoriaValida.setServentuarioCPF("00751041510100");
        guiaProvisoriaValida.setIdentificadorAdolescente("86478956241");

        Response response = given ()
                .baseUri(baseURI)
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(guiaProvisoriaValida)
                .when()
                .post("/provisoria")
                .then().log().all()
                .statusCode(400)
                .extract().response();
    }


}
