package br.com.jus.data.specs;

import br.com.jus.base.auth.requests.PostAuthRequest;
import br.com.jus.data.factory.adolescente.AdolescenteDataFactory;
import br.com.jus.data.pojo.adolescente.BodyCadastrarAdolescente;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static br.com.jus.base.auth.requests.PostAuthRequest.gerarToken;

public class RequestSpecsAdolescente {

    public RequestSpecsAdolescente() throws Exception {
    }

    static BodyCadastrarAdolescente bodyCadastrarAdolescente;

    static {
        try {
            bodyCadastrarAdolescente = AdolescenteDataFactory.dataCadastroAdolescente();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static RequestSpecification setConsultaTodosAdolecentes() {
        return new RestAssured().given()
                .queryParam("offset", 1)
                .queryParam("pageNumber", "25")
                .queryParam("pageSize", "25")
                .queryParam("paged", "25")
                .queryParam("sort.sorted", "25")
                .queryParam("sort.unsorted", "25")
                .queryParam("unpaged", "25");
    }


   public static RequestSpecification setCadastrarAdolescente() throws Exception {
       return new RestAssured().given()
               .header("Authorization", "Bearer " + gerarToken())
               .body(bodyCadastrarAdolescente);
   }

   //Tentando montar o método que executa a busca por CPF
    public static RequestSpecification getAdolescentePorCPF() throws Exception {
        AdolescenteDataFactory adoDataFactory = new AdolescenteDataFactory();
        adoDataFactory.obterDadosDoAdolescente();

        return new RestAssured().given()
                .header("Authorization", "Bearer " + gerarToken())
                .body(bodyCadastrarAdolescente);
    }

}
