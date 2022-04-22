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

public class GetConsultarAdolescentesSimilaridadeTest extends BaseTest {


}