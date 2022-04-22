package br.com.jus.tests.adolescente.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static br.com.jus.config.ConfigurationManager.configuration;
import static br.com.jus.data.factory.adolescente.BaseAdolescenteData.URL_ADOLESCENTE;
import static br.com.jus.data.specs.RequestSpecsAdolescente.setCadastrarAdolescente;

public class PostCadastrarAdolescenteRequest {

    @Step("Cadastro de adolescente realizado com sucesso")
    public Response cadastrarAdolescente() throws Exception {
        //obterDadosDoAdolescente();


        return setCadastrarAdolescente()
                .when().log().all()
                .post(URL_ADOLESCENTE);

    }

    @Step("Validação de contrato do cadastro de adolescente realizada com sucesso")
    public Response contratoCadastroAdolescente() throws Exception {
        return setCadastrarAdolescente()
                .when()
                .post(URL_ADOLESCENTE);
    }

    @Step("Validação de path inválido no cadastro de adolescente realizada com sucesso")
    public Response pathInvalido() throws Exception {
        return setCadastrarAdolescente()
                .when()
                .post(configuration().urlAdolescente().concat("/api/v2/adolescentes"));
    }

    @Step("Validação de método não suportado no cadastro de adolescente realizada com sucesso")
    public Response metodoNaoSuportado() throws Exception {
        return setCadastrarAdolescente()
                .when()
                .delete(URL_ADOLESCENTE);
    }
}

