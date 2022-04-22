package br.com.jus.tests.guia;

import br.com.jus.base.auth.requests.PostAuthRequest;
import br.com.jus.config.Configuration;
import br.com.jus.data.factory.guia.GuiaDefinitivaDataFactory;
import br.com.jus.data.factory.guia.GuiaGerarPDFDataFactory;
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


public class GerarPDFGuiasTests {

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
      public void deveGerarPDF () throws JsonProcessingException {
           String numeroGuia = GuiaGerarPDFDataFactory.CriarNumeroGuia(token, baseURI, basePath, guiaDefinitivaValida);
            RestAssured.defaultParser = Parser.JSON;

                Response response = given()
                    .contentType(ContentType.JSON)
                   .header("Authorization", "Bearer " + token)
                    .when()
                   .get("/api/v1/guias/definitiva/numero-guia/" + numeroGuia + "/pdf")
                    .then()
                   .statusCode(200)
                   .extract().response();

           System.out.println("https://qa-sedu-api.stg.cloud.cnj.jus.br/api/v1/guias/definitiva/numero-guia/" + numeroGuia + "/pdf");

        }

    }







