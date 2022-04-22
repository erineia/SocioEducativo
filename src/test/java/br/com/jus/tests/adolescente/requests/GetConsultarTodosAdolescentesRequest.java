package br.com.jus.tests.adolescente.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static br.com.jus.config.ConfigurationManager.configuration;
import static br.com.jus.data.factory.adolescente.BaseAdolescenteData.URL_ADOLESCENTE;
import static br.com.jus.data.specs.RequestSpecsAdolescente.setConsultaTodosAdolecentes;

public class GetConsultarTodosAdolescentesRequest {

    @Step("Consulta de todos os adolescentes realizada com sucesso")
    public Response consultarTodosAdolescentes() throws Exception {
        return setConsultaTodosAdolecentes()
                .when()
                .get(URL_ADOLESCENTE);
    }

    @Step("Validação de contrato da consulta de todos os adolescentes realizada com sucesso")
    public Response contratoconsultaTodosAdolescentes() throws Exception {
        return setConsultaTodosAdolecentes()
                .when()
                .get(URL_ADOLESCENTE);
    }

    @Step("Validação de path inválido na consulta de todos os adolescentes realizada com sucesso")
    public Response pathInvalido() {
        return setConsultaTodosAdolecentes()
                .when()
                .get(configuration().urlAdolescente().concat("/api/v2/adolescentes"));
    }

//    @Step("Validação de método não suportado na consulta de todos os adolescentes realizada com sucesso")
//    public Response metodoNaoSuportado() {
//        return setConsultaTodosAdolecentes()
//                .when()
//                .delete(URL_ADOLESCENTE);
//    }
}

