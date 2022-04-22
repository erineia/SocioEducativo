package br.com.jus.data.factory.adolescente;

import br.com.jus.data.pojo.adolescente.BodyCadastrarAdolescente;
import br.com.jus.data.pojo.adolescente.BodyCertidaoNascimento;
import br.com.jus.data.pojo.adolescente.BodyCpf;
import br.com.jus.data.pojo.adolescente.BodyRg;
import br.com.jus.utils.DateUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static br.com.jus.base.auth.requests.PostAuthRequest.gerarToken;
import static br.com.jus.data.factory.adolescente.BaseAdolescente.*;
import static br.com.jus.data.factory.adolescente.BaseAdolescenteData.URL_ADOLESCENTE;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class AdolescenteDataFactory {

    public static String RETORNAIDENTIFICADOR;
    public static String RETORNACPF;
    public static String RETORNANOMEADOLESCENTE;
    public static String RETORNASOBRENOME;
    public static String RETORNARG;


    public static BodyCadastrarAdolescente dataCadastroAdolescente() throws Exception {

        BodyCadastrarAdolescente bodyCadastrarAdolescente = new BodyCadastrarAdolescente();
        BodyCertidaoNascimento bodyCertidaoNascimento = new BodyCertidaoNascimento();
        BodyRg bodyRg = new BodyRg();
        BodyCpf bodyCpf = new BodyCpf();

        bodyCadastrarAdolescente.setCertidaoNascimento(bodyCertidaoNascimento);
        bodyCertidaoNascimento.setCartorio("Cartorio de registros");
        bodyCertidaoNascimento.setFolha("V8");
        bodyCertidaoNascimento.setLivro("Livro 2");
        bodyCertidaoNascimento.setNumero(UUID.randomUUID().toString());
        bodyCadastrarAdolescente.setCpf(bodyCpf);
        bodyCpf.setNumero(CPF);
        bodyCadastrarAdolescente.setDataNascimento(DateUtils.getDateDifferenceDays(-6000));
        bodyCadastrarAdolescente.setDataNascimentoPresumida("N");
        bodyCadastrarAdolescente.setIdentidadeGenero(IDENTIDADE_GENERO);
        bodyCadastrarAdolescente.setNaturalidade(NATURALIDADE);
        bodyCadastrarAdolescente.setNome(NOME);
        bodyCadastrarAdolescente.setNomeMae(NOME_MAE);
        bodyCadastrarAdolescente.setNomePai(NOME_PAI);
        bodyCadastrarAdolescente.setNomeSocial(NOME_SOCIAL);
        bodyCadastrarAdolescente.setOrientacaoSexual(ORIENTACAO_SEXUAL);
        bodyCadastrarAdolescente.setPossuiNomeSocial("N");
        bodyCadastrarAdolescente.setRacaCor(RACA_COR);
        bodyCadastrarAdolescente.setRg(bodyRg);
        bodyRg.setDataExpedicao(DateUtils.getDateDifferenceDays(-4000));
        bodyRg.setEstadoRg(UF);
        bodyRg.setNumero(RG);
        bodyRg.setOrgaoExpedidor("SSP");
        bodyCadastrarAdolescente.setSexoBiologico(SEXO_BIOLOGICO);
        bodyCadastrarAdolescente.setSobrenome(SOBRENOME);
        return bodyCadastrarAdolescente;
    }


    public void obterDadosDoAdolescente() {
        Response response = given()
                .header("Authorization", "Bearer " + gerarToken())
                .when()
                .get(URL_ADOLESCENTE)
                .then()
                .extract().response();

        JsonPath extractor = response.jsonPath();

        RETORNAIDENTIFICADOR = extractor.get("dados.content.identificador[0]");
        RETORNACPF = extractor.get("dados.content.cpf.numero[0]");
        RETORNANOMEADOLESCENTE = extractor.get("dados.content.nome[0]");
        RETORNASOBRENOME = extractor.get("dados.content.sobrenome[0]");
        RETORNARG = extractor.get("dados.content.rg.numero[0]");

    }

}
