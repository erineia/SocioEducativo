package br.com.jus.tests.adolescente.tests;
import br.com.jus.base.baseTest.BaseTest;
import br.com.jus.runners.AllTests;
import br.com.jus.runners.Contracts;
import br.com.jus.tests.adolescente.requests.PostCadastrarAdolescenteRequest;
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
@Feature("Socio Educativo")
@DisplayName("Cadastrar Adolescente")

public class PostCadastrarAdolescenteTest extends BaseTest {

    private PostCadastrarAdolescenteRequest postCadastrarAdolescenteRequest =
            new PostCadastrarAdolescenteRequest();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category({AllTests.class})
    @DisplayName("Validar o cadastro de adolescente")
    public void testCadastarAdolescente() throws Exception {
        postCadastrarAdolescenteRequest.cadastrarAdolescente()
                .then().log().all()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Category({Contracts.class, AllTests.class})
    @DisplayName("Validar a garantia do contrato do cadastro de adolescente")
    public void testContratoCadastroAdolescente() throws Exception {
        postCadastrarAdolescenteRequest.contratoCadastroAdolescente()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat().body(matchesJsonSchema(
                        new File(Documents.getContractsBasePath("adolescente", "PostCadastrarAdolescentesApi"))));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category({AllTests.class})
    @DisplayName("Validar Path inválido no cadastro de adolescente")
    public void testPathInvalido() throws Exception {
        postCadastrarAdolescenteRequest.pathInvalido()
                .then()
                .statusCode(HttpStatus.SC_FORBIDDEN);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category({AllTests.class})
    @DisplayName("Validar método não suportado no cadastro de adolescente")
    public void testMetodoNaoSuportado() throws Exception {
        postCadastrarAdolescenteRequest.metodoNaoSuportado()
                .then()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }


}