package br.com.jus.tests.adolescente.tests;

import br.com.jus.base.baseTest.BaseTest;
import br.com.jus.runners.AllTests;
import br.com.jus.runners.Contracts;
import br.com.jus.tests.adolescente.requests.GetConsultarTodosAdolescentesRequest;
import br.com.jus.utils.Documents;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

@Epic("Jus")
@Feature("Adolescente")
@DisplayName("Consultar todos os adolescentes")

public class GetConsultarTodosAdolescentesTest extends BaseTest {

    private GetConsultarTodosAdolescentesRequest getConsultarTodosAdolescentesRequest =
            new GetConsultarTodosAdolescentesRequest();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category({AllTests.class})
    @DisplayName("Validar a consulta de todos os adolescentes")
    public void testConsultarTodosAdolescentes() throws Exception {
        getConsultarTodosAdolescentesRequest.consultarTodosAdolescentes()
                .then().log().all()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Category({Contracts.class, AllTests.class})
    @DisplayName("Validar a garantia do contrato do retorno da consulta de todos os adolescentes")
    public void testGarantirContratosConsultaAdolescentes() throws Exception {
        getConsultarTodosAdolescentesRequest.contratoconsultaTodosAdolescentes()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat().body(matchesJsonSchema(
                        new File(Documents.getContractsBasePath("adolescente", "GetConsultarTodosAdolescentesApi"))));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category({AllTests.class})
    @DisplayName("Validar Path inválido na consulta de todos os adolescentes")
    public void testPathInvalido() throws Exception {
        getConsultarTodosAdolescentesRequest.pathInvalido()
                .then().log().all()
                .statusCode(HttpStatus.SC_FORBIDDEN);
    }

//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Category({Healthcheck.class, AllTests.class})
//    @DisplayName("Validar método não suportado na consulta de todos os adolescentes")
//    public void testMetodoNaoSuportado() throws Exception {
//        getConsultarTodosAdolescentesRequest.metodoNaoSuportado()
//                .then().log().all()
//                .statusCode(HttpStatus.SC_METHOD_NOT_ALLOWED);
//    }
}